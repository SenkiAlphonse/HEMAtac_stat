package com.hematac.fencingstats.models.boutinfos;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;

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

  private boolean pointWorthy;

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

  public boolean isPointWorthy() {
    return pointWorthy;
  }

  public void setPointWorthy(boolean pointWorthy) {
    this.pointWorthy = pointWorthy;
  }
}
