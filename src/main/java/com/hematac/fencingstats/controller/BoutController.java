package com.hematac.fencingstats.controller;

import com.hematac.fencingstats.models.boutinfos.Bout;
import com.hematac.fencingstats.service.boutinfoservice.boutservice.BoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class BoutController {

    private BoutService boutService;

    @Autowired
    public BoutController(BoutService boutService){
        this.boutService = boutService;

    }

    @GetMapping("/bouts")
    public String displayBouts(Model model,
                               @RequestParam(name = "pageid", required = false, defaultValue = "0") int pageId,
                               @RequestParam(name = "fencername", required = false)String fencerName) {
        List<Bout> peekPage = boutService.getAll(pageId + 1);
        model.addAttribute("islastpage", peekPage.size() == 0);
        model.addAttribute("pageid", pageId);

        if (fencerName == null) {
            model.addAttribute("bouts", boutService.getDtosFromEntities(boutService.getAll(pageId)));
        }
        else{
            List<Bout> filteredBouts= boutService.getAll(fencerName, pageId);
/*                    .stream()
                    .filter(b -> b.getFencerOne().getName().toLowerCase().contains(fencerName)
                                || b.getFencerTwo().getName().toLowerCase().contains(fencerName)).collect(Collectors.toList());
            model.addAttribute("bouts", boutService.getDtosFromEntities(filteredBouts));*/
        }
        return "bouts";
    }
}
