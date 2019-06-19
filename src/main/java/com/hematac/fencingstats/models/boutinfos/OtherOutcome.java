package com.hematac.fencingstats.models.boutinfos;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class OtherOutcome extends AssaultOutcome {
  private String sideNote;
  //injury, etc.


  public String getSideNote() {
    return sideNote;
  }

  public void setSideNote(String sideNote) {
    this.sideNote = sideNote;
  }
}
