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

  //BoutType-ot át kell gndolni

  //modelattribute-ba countrycodes tömb, onnan kell választani és beírni a nationalitybe.
  //private static String[] countryCodes = Locale.getISOCountries();
/*  for (String countryCode : countryCodes) {

    Locale obj = new Locale("", countryCode);

    System.out.println("Country Code = " + obj.getCountry()
        + ", Country Name = " + obj.getDisplayCountry());
  }*/

  //club-fed mapping

  //enumokba tostring fromstring methods;

  //logger implementation!!!

  //user--fencerId etc verifikáció
}
