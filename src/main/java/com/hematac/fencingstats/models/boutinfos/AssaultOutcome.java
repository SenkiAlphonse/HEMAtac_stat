package com.hematac.fencingstats.models.boutinfos;

import com.hematac.fencingstats.models.sportentities.Fencer;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "assault_outcomes")
public abstract class AssaultOutcome {
  @Id
  @GeneratedValue
  private long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "bout_id")
  private Bout bout;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(name = "assault_outcome_fencer",
          joinColumns = @JoinColumn(name = "outcome_id"),
          inverseJoinColumns = @JoinColumn(name = "receiving_fencer_id")
  )
  private Set<Fencer> receivingFencers = new HashSet<>();

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

  public Set<Fencer> getReceivingFencers() {
    return receivingFencers;
  }

  public void setReceivingFencers(Set<Fencer> receivingFencers) {
    this.receivingFencers = receivingFencers;
  }

  public boolean isPointWorthy() {
    return pointWorthy;
  }

  public void setPointWorthy(boolean pointWorthy) {
    this.pointWorthy = pointWorthy;
  }
}
