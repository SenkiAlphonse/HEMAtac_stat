package com.hematac.fencingstats.models.boutinfos;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class YellowCard extends AssaultOutcome {
  private String sideNote;

  public String getSideNote() {
    return sideNote;
  }

  public void setSideNote(String sideNote) {
    this.sideNote = sideNote;
  }
}
