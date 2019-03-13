package com.hematac.fencingstats.models.boutinfos;

import com.hematac.fencingstats.models.sportentities.Fencer;
import com.hematac.fencingstats.models.sportentities.Referee;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "bouts")
public class Bout {

  @Id
  @GeneratedValue
  private long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "event_id")
  private Event event;

  @ManyToMany(cascade = {
      CascadeType.PERSIST,
      CascadeType.MERGE,
      CascadeType.REFRESH
  })
  @JoinTable(name = "bout_fencer",
      joinColumns = @JoinColumn(name = "bout_id"),
      inverseJoinColumns = @JoinColumn(name = "fencer_id")
  )
  private List<Fencer> fencers = new ArrayList<>();
  //Fencers don't have to be users.

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "referee_id")
  private Referee referee;

  private BoutType boutType;
}
