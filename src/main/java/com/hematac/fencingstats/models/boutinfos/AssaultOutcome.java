package com.hematac.fencingstats.models.boutinfos;

import javax.persistence.*;

@Entity
@Table(name = "assault_outcomes")
public abstract class AssaultOutcome {
  @Id
  @GeneratedValue
  private long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "bout_id")
  private Bout bout;

  private FencersOfBout receivedBy;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Bout getBout() {
    return bout;
  }

  public void setBout(Bout bout) {
    this.bout = bout;
  }

  public FencersOfBout getReceivedBy() {
    return receivedBy;
  }

  public void setReceivedBy(FencersOfBout receivedBy) {
    this.receivedBy = receivedBy;
  }
}
