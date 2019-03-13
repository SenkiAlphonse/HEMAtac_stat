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

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "fencer_green_id")
  private Fencer fencerGreen;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "fencer_red_id")
  private Fencer fencerRed;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "referee_id")
  private Referee referee;

  private BoutType boutType;

  //bout resultot is érdemes tárolni v számolni,
  // és a meccs végződéének okát -->pont limit, idő limit, feketelap, sárülés, egyéb
}
