package com.hematac.fencingstats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FencingstatsApplication {

  public static void main(String[] args) {
    SpringApplication.run(FencingstatsApplication.class, args);
  }

  //userek tudjanak engedélyt adni más usereknek arra, hogy láthassák az adataikat.
  //User role-okat felül kell vizsgálni.
  //coach entity a sportentitiesbe
  //fencer-coach-affiliation tábla a sportentitybe

  //oneToOne map user - fencer, user - coach, user - referee

  //törlési lehetőség

  //Federations mint entity hozzáadni

  //user -->
    //club membership w start and end dates, bidirectional one-to many entity.
    //one-to-one map to sportsentities
    //list of users the user allows access to their data

}
