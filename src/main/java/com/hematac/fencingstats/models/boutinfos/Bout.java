package com.hematac.fencingstats.models.boutinfos;

import com.hematac.fencingstats.models.sportentities.Fencer;
import com.hematac.fencingstats.models.sportentities.Referee;
import com.hematac.fencingstats.models.sportentities.Weapon;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "bouts")
public abstract class Bout {

  @Id
  @GeneratedValue
  private long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "event_id")
  private Event event;

  private Date date;

  private Weapon weapon;

  private BoutType boutType;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "fencer_one_id")
  private Fencer fencerOne;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "fencer_two_id")
  private Fencer fencerTwo;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "referee_id")
  private Referee referee;

  @OneToMany(mappedBy = "bout")
  private List<AssaultOutcome> assaultOutcomeList = new ArrayList<>();

  private BoutOutcome boutOutcome;
}
