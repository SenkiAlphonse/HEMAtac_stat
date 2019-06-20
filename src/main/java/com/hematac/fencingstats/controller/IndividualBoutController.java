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
        IndividualBout individualBoutDummy2 = new IndividualBout();
        IndividualBout individualBoutDummy3 = new IndividualBout();
        IndividualBout individualBoutDummy4 = new IndividualBout();
        Fencer fencerJoe = new Fencer();
        fencerJoe.setName("fencerJoe");
        Fencer fencerJane = new Fencer();
        fencerJane.setName("fencerJane");
        Fencer fencerMartha = new Fencer();
        fencerMartha.setName("fencerMartha");
        Fencer fencerAlphonse = new Fencer();
        fencerAlphonse.setName("fencerAlphonse");
        fencerService.save(fencerJoe);
        fencerService.save(fencerJane);
        fencerService.save(fencerMartha);
        fencerService.save(fencerAlphonse);

        individualBoutDummy1.setFencerOne(fencerJoe);
        individualBoutDummy1.setFencerTwo(fencerJane);
        individualBoutDummy2.setFencerOne(fencerMartha);
        individualBoutDummy2.setFencerTwo(fencerJane);
        individualBoutDummy3.setFencerOne(fencerJoe);
        individualBoutDummy3.setFencerTwo(fencerMartha);
        individualBoutDummy4.setFencerOne(fencerAlphonse);
        individualBoutDummy4.setFencerTwo(fencerMartha);
        individualBoutService.save(individualBoutDummy1);
        individualBoutService.save(individualBoutDummy2);
        individualBoutService.save(individualBoutDummy3);
        individualBoutService.save(individualBoutDummy4);
    }
}
