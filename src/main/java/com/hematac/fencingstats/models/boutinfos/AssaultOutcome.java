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
}
