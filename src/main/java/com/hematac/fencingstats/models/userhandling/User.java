package com.hematac.fencingstats.models.userhandling;

import javax.persistence.*;

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
