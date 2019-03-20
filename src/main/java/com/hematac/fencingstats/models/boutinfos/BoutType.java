package com.hematac.fencingstats.models.boutinfos;


import javax.persistence.*;

@Entity
@Table(name = "bout_types")
public class BoutType {

  @Id
  @GeneratedValue
  private long id;

  private String name;
  //pool, DE, final, repechage

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "rulebook_id")
  private RuleBookType ruleBookType;

  private int pointCap;

  private int timeCap;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RuleBookType getRuleBookType() {
    return ruleBookType;
  }

  public void setRuleBookType(RuleBookType ruleBookType) {
    this.ruleBookType = ruleBookType;
  }

  public int getPointCap() {
    return pointCap;
  }

  public void setPointCap(int pointCap) {
    this.pointCap = pointCap;
  }

  public int getTimeCap() {
    return timeCap;
  }

  public void setTimeCap(int timeCap) {
    this.timeCap = timeCap;
  }
}
