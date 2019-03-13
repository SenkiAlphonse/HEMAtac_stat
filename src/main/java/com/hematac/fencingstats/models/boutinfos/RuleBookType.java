package com.hematac.fencingstats.models.boutinfos;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class RuleBookType {

  @Id
  @GeneratedValue
  private long id;

  private String name;

}
