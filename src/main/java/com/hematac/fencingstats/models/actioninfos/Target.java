package com.hematac.fencingstats.models.actioninfos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "targets")
public class Target {

  @Id
  @GeneratedValue
  private long id;

  private String name;
}
