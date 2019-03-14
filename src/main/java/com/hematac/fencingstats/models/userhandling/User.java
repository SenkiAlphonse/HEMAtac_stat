package com.hematac.fencingstats.models.userhandling;

import com.hematac.fencingstats.models.sportentities.ClubAffiliation;
import com.hematac.fencingstats.models.sportentities.Handedness;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue
  private long id;

  private String firstName;
  private String middleName;
  private String lastName;


  //club membership w start and end dates, bidirectional one-to many entity.

}
