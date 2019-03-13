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
  @JoinColumn(name = "exchange_winner")
  private Fencer exchangeWinner;

  @CreationTimestamp
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "date_created")
  private Date dateCreated;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "fencing_action")
  private FencingAction fencingAction;

}
