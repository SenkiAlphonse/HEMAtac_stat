package com.hematac.fencingstats.controller;

import com.hematac.fencingstats.models.boutinfos.IndividualBout;
import com.hematac.fencingstats.models.sportentities.Fencer;
import com.hematac.fencingstats.service.boutinfoservice.boutservice.IndividualBoutService;
import com.hematac.fencingstats.service.sportsentityservice.FencerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class IndividualBoutController {

    private IndividualBoutService individualBoutService;
    private FencerService fencerService;

    @Autowired
    public IndividualBoutController(IndividualBoutService individualBoutService, FencerService fencerService){
        this.individualBoutService = individualBoutService;
        this.fencerService = fencerService;

        IndividualBout individualBoutDummy1 = new IndividualBout();
        Fencer fencerJoe = new Fencer();
        fencerJoe.setName("fencerJoe");
        Fencer fencerJane = new Fencer();
        fencerJane.setName("fencerJane");
        fencerService.save(fencerJoe);
        fencerService.save(fencerJane);
        individualBoutDummy1.setFencerOne(fencerJoe);
        individualBoutDummy1.setFencerTwo(fencerJane);
        individualBoutService.save(individualBoutDummy1);
    }
}
