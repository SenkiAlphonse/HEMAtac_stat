package com.hematac.fencingstats.models.boutinfos;

import com.hematac.fencingstats.models.actioninfos.FencingAction;
import com.hematac.fencingstats.models.actioninfos.PisteZone;
import com.hematac.fencingstats.models.actioninfos.Target;
import com.hematac.fencingstats.models.sportentities.Fencer;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "touches")
public class Touch extends AssaultOutcome {

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "fencing_action_id")
  private FencingAction fencingAction;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "piste_zone_id")
  private PisteZone pisteZone;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "target_id")
  private Target target;



}
