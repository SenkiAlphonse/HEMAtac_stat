package com.hematac.fencingstats.models.boutinfos;

import com.hematac.fencingstats.models.sportentities.Fencer;
import com.hematac.fencingstats.models.sportentities.Referee;

import javax.persistence.*;

@Entity
@Table(name = "bouts")
public class Bout {

  @Id
  @GeneratedValue
  private long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "event_id")
  private Event event;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "fencer_one_id")
  private Fencer fencerOne;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "fencer_two_id")
  private Fencer fencerTwo;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "referee_id")
  private Referee referee;

  private BoutType boutType;

  //bout resultot is érdemes tárolni v számolni,
  //és a meccs végződéének okát -->pont limit, idő limit, feketelap, sárülés, egyéb
}
