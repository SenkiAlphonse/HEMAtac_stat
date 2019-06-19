package com.hematac.fencingstats.controller;

import com.hematac.fencingstats.models.boutinfos.Bout;
import com.hematac.fencingstats.repository.boutinforepository.TeamMatchRepository;
import com.hematac.fencingstats.repository.boutinforepository.boutrepository.BoutRepository;
import com.hematac.fencingstats.repository.boutinforepository.boutrepository.IndividualBoutRepository;
import com.hematac.fencingstats.repository.boutinforepository.boutrepository.TeamMatchBoutRepository;
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
    public String displayBouts(Model model, @RequestParam(name = "filter", required = false)String fencername) {
        if (fencername == null) {
            model.addAttribute("bouts", boutService.getDtosFromEntities(boutService.getAll()));
        }
        else{
            List<Bout> filteredBouts= boutService.getAll()
                    .stream()
                    .filter(
                            b -> b.getFencerOne().getName().toLowerCase().contains(fencername)
                                || b.getFencerTwo().getName().toLowerCase().contains(fencername)).collect(Collectors.toList());
            model.addAttribute("bouts", boutService.getDtosFromEntities(filteredBouts));
        }
        return "bouts";
    }
}
