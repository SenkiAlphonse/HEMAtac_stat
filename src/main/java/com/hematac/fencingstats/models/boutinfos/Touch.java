package com.hematac.fencingstats.models.boutinfos;

import com.hematac.fencingstats.models.actioninfos.FencingAction;
import com.hematac.fencingstats.models.actioninfos.PisteZone;
import com.hematac.fencingstats.models.actioninfos.Target;

import javax.persistence.*;

@Entity
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

  private Boolean isFirstAfterBreak;

  public FencingAction getFencingAction() {
    return fencingAction;
  }

  public void setFencingAction(FencingAction fencingAction) {
    this.fencingAction = fencingAction;
  }

  public PisteZone getPisteZone() {
    return pisteZone;
  }

  public void setPisteZone(PisteZone pisteZone) {
    this.pisteZone = pisteZone;
  }

  public Target getTarget() {
    return target;
  }

  public void setTarget(Target target) {
    this.target = target;
  }

  public Boolean getFirstAfterBreak() {
    return isFirstAfterBreak;
  }

  public void setFirstAfterBreak(Boolean firstAfterBreak) {
    isFirstAfterBreak = firstAfterBreak;
  }
}
