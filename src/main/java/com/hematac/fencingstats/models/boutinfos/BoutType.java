package com.hematac.fencingstats.models.boutinfos;


import javax.persistence.*;

@Entity
@Table(name = "bout_types")
public class BoutType {

  @Id
  @GeneratedValue
  private long id;

  private String name;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "rulebook_id")
  private RuleBookType ruleBookType;

  private int pointCap;

  private int timeCap;
  //pool, DE, final, ??
}
