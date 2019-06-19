package com.hematac.fencingstats.controller.restcontroller;

import com.hematac.fencingstats.customexception.runtimeexception.InternalServerErrorEx;
import com.hematac.fencingstats.dto.BoutDtoDisplay;
import com.hematac.fencingstats.service.boutinfoservice.boutservice.BoutService;
import com.hematac.fencingstats.service.boutinfoservice.boutservice.IndividualBoutService;
import com.hematac.fencingstats.service.boutinfoservice.boutservice.TeamMatchBoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    public ResponseEntity<List<BoutDtoDisplay>> products() {
        List<BoutDtoDisplay> boutDtos = boutService.getDtosFromEntities(boutService.getAll());
        if (boutDtos != null || !boutDtos.isEmpty()) {
            return new ResponseEntity<>(boutDtos, HttpStatus.OK);
        }
        throw new InternalServerErrorEx("Can't find bouts");
    }
}
