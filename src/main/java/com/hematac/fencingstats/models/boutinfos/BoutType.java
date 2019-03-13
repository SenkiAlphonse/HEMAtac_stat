package com.hematac.fencingstats.models.boutinfos;


import javax.persistence.*;

@Entity
@Table(name = "bout_types")
public class BoutType {

  @Id
  @GeneratedValue
  private long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "rulebook_id")
  private RuleBookType ruleBookType;

  private String name;

  private int pointCap;

  private int timeCap;


}
