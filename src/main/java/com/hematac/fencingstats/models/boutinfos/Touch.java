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
public class Touch {

  @Id
  @GeneratedValue
  private long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "bout")
  private Bout bout;

  private FencersOfBout givenBy;
/*  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "given_by")
  private Fencer givenBy;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "received_by")
  private Fencer receivedBy;*/

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "fencing_action_id")
  private FencingAction fencingAction;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "piste_zone_id")
  private PisteZone pisteZone;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "target_id")
  private Target target;

  @CreationTimestamp
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "date_created")
  private Date dateCreated;

}
