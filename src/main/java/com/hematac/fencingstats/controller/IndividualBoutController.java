package com.hematac.fencingstats.controller;

import com.hematac.fencingstats.models.boutinfos.IndividualBout;
import com.hematac.fencingstats.models.sportentities.Fencer;
import com.hematac.fencingstats.service.boutinfoservice.boutservice.IndividualBoutService;
import com.hematac.fencingstats.service.sportsentityservice.FencerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.HashSet;
import java.util.Set;

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

        Set<Fencer> bout1 = new HashSet<>();
        bout1.add(fencerJoe);
        bout1.add(fencerJane);

        Set<Fencer> bout2 = new HashSet<>();
        bout2.add(fencerMartha);
        bout2.add(fencerJane);

        Set<Fencer> bout3 = new HashSet<>();
        bout3.add(fencerJoe);
        bout3.add(fencerMartha);

        Set<Fencer> bout4 = new HashSet<>();
        bout4.add(fencerAlphonse);
        bout4.add(fencerMartha);

        individualBoutDummy1.getFencers().add(fencerJoe);
        individualBoutDummy1.getFencers().add(fencerJane);
        individualBoutDummy2.setFencers(bout2);
        individualBoutDummy3.setFencers(bout3);
        individualBoutDummy4.setFencers(bout4);


        fencerService.save(fencerJoe);
        fencerService.save(fencerJane);
        fencerService.save(fencerMartha);
        fencerService.save(fencerAlphonse);

        individualBoutService.save(individualBoutDummy1);
        individualBoutService.save(individualBoutDummy2);
        individualBoutService.save(individualBoutDummy3);
        individualBoutService.save(individualBoutDummy4);
    }
}
