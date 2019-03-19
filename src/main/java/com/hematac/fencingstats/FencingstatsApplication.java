package com.hematac.fencingstats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FencingstatsApplication {

  public static void main(String[] args) {
    SpringApplication.run(FencingstatsApplication.class, args);
  }

  //userek tudjanak engedélyt adni más usereknek arra, hogy láthassák az adataikat. Egy ilyen engedély egyirányú kell legyen.

  //user fields validation (strings)

  //törlési lehetőség

  //Federation - club association, fed-fed association (super-sub)

  //list/set collection usage revision!

  //user -->
    //club membership w start and end dates, bidirectional one-to many entity.
    //one-to-one map to sportsentities
    //list of users the user allows access to their data

}
