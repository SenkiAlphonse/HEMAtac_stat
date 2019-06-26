package com.hematac.fencingstats.models.boutinfos;


import javax.persistence.*;

@Entity
@Table(name = "bout_schemes")
public class BoutScheme {
  //make this an enum?

  @Id
  @GeneratedValue
  private long id;

  private BoutSchemeTypes boutSchemeType;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "rulebook_id")
  private RuleBook ruleBook;

  private int pointCap;

  private int timeCap;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public BoutSchemeTypes getBoutSchemeType() {
    return boutSchemeType;
  }

  public void setBoutSchemeType(BoutSchemeTypes boutSchemeType) {
    this.boutSchemeType = boutSchemeType;
  }

  public RuleBook getRuleBook() {
    return ruleBook;
  }

  public void setRuleBook(RuleBook ruleBook) {
    this.ruleBook = ruleBook;
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
