package com.hematac.fencingstats.controller.restcontroller;

import com.hematac.fencingstats.exception.runtimeexception.InternalServerErrorException;
import com.hematac.fencingstats.dto.BoutDtoDisplay;
import com.hematac.fencingstats.service.DtoService;
import com.hematac.fencingstats.service.boutinfoservice.boutservice.BoutService;
import com.hematac.fencingstats.service.boutinfoservice.boutservice.IndividualBoutService;
import com.hematac.fencingstats.service.boutinfoservice.boutservice.TeamMatchBoutService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BoutRESTController {

    private static Logger logger = LoggerFactory.getLogger(BoutRESTController.class);

    private BoutService boutService;
    private IndividualBoutService individualBoutService;
    private TeamMatchBoutService teamMatchBoutService;
    private DtoService dtoService;

    @Autowired
    public BoutRESTController(BoutService boutService, IndividualBoutService individualBoutService, TeamMatchBoutService teamMatchBoutService, DtoService dtoService){
        this.boutService = boutService;
        this.individualBoutService = individualBoutService;
        this.teamMatchBoutService = teamMatchBoutService;
        this.dtoService = dtoService;
    }

    @GetMapping("/api/bouts")
    public ResponseEntity<List<BoutDtoDisplay>> getAllBouts() {
        List<BoutDtoDisplay> boutDtos = dtoService.getDtosFromBouts(boutService.getAll());
        if (boutDtos != null) {
            return new ResponseEntity<>(boutDtos, HttpStatus.OK);
        }
        throw new InternalServerErrorException("Can't find bouts");
    }
}
