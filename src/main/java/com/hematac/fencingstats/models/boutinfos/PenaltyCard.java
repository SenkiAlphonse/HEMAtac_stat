package com.hematac.fencingstats.models.boutinfos;

import com.hematac.fencingstats.models.sportentities.Fencer;

import javax.persistence.*;

@Entity
@Table(name = "penalty_cards")
public abstract class PenaltyCard {

  @Id
  @GeneratedValue
  private long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "receiver_id")
  private Fencer receivedBy;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "benefiter_id")
  private Fencer benefitsTo;

}
