package com.hematac.fencingstats.models.boutinfos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rule_book_types")
public class RuleBookType {

  @Id
  @GeneratedValue
  private long id;

  private String name;

  //data about rulebook, like arena size, length of bouts, RoW or Combat,
  // but these can change a lot so maybe overcomplicated to keep track.
}
