package com.hematac.fencingstats.models.boutinfos;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "other_outcomes")
public class OtherAssaultOutcome extends AssaultOutcome {
  private String sideNote;
  //injury, losing weapon, falling on face, etc.

  public String getSideNote() {
    return sideNote;
  }

  public void setSideNote(String sideNote) {
    this.sideNote = sideNote;
  }
}
