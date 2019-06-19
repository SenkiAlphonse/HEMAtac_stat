package com.hematac.fencingstats.controller.restcontroller;

import com.hematac.fencingstats.service.boutinfoservice.boutservice.BoutService;
import com.hematac.fencingstats.service.boutinfoservice.boutservice.IndividualBoutService;
import com.hematac.fencingstats.service.boutinfoservice.boutservice.TeamMatchBoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoutRESTController {

    private BoutService boutService;
    private IndividualBoutService individualBoutService;
    private TeamMatchBoutService teamMatchBoutService;

    @Autowired
    public BoutRESTController(BoutService boutService, IndividualBoutService individualBoutService, TeamMatchBoutService teamMatchBoutService){
        this.boutService = boutService;
        this.individualBoutService = individualBoutService;
        this.teamMatchBoutService = teamMatchBoutService;
    }

    @GetMapping("/api/bouts")
    public ResponseEntity<List<BoutDto>> products() {
        List<BoutDto> boutDtos = boutService.getDtosFromEntities(boutService.getAll());
        if (boutDtos != null || !boutDtos.isEmpty()) {
            return new ResponseEntity<>(boutDtos, HttpStatus.OK);
        }
        throw new InternalServerErrorException("Can't find bouts");
    }
}
