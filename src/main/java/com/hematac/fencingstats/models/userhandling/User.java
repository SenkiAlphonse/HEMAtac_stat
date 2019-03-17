package com.hematac.fencingstats.models.userhandling;

import com.hematac.fencingstats.models.sportentities.Weapon;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue
  private long id;

  private String firstName;
  private String middleName;
  private String lastName;
  private String aboutMe;
  private Set<Weapon> analyzedWeapons = new HashSet<>();


  //club membership w start and end dates, bidirectional one-to many entity.

}
