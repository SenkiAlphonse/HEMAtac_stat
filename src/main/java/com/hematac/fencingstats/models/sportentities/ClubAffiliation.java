package com.hematac.fencingstats.models.sportentities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "club_affiliations")
public class ClubAffiliation {

  @Id
  @GeneratedValue
  private long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "fencer_id")
  private Fencer fencer;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "club_id")
  private Club club;

  private Date dateOfEntry;

  private Date dateOfLeaving;
}
