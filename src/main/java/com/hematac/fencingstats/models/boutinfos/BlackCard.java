package com.hematac.fencingstats.models.boutinfos;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "black_cards")
public class BlackCard extends AssaultOutcome {

  private String sideNote;
}
