package com.hematac.fencingstats.models.boutinfos;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "other_outcomes")
public class OtherOutcome extends AssaultOutcome {
  private String sideNote;
  //injury, etc.
}
