package com.hematac.fencingstats.models.boutinfos;

import com.hematac.fencingstats.models.actioninfos.FencingAction;
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

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "fencing_action")
  private FencingAction fencingAction;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "given_by")
  private Fencer givenBy;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "received_by")
  private Fencer receivedBy;

  @CreationTimestamp
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "date_created")
  private Date dateCreated;

}
