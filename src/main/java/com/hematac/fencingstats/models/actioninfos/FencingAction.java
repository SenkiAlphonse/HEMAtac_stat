package com.hematac.fencingstats.models.actioninfos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fencing_actions")
public class FencingAction {
  @Id
  @GeneratedValue
  private long id;

  private String name;


}
