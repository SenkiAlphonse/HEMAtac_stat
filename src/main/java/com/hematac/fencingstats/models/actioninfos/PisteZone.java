package com.hematac.fencingstats.models.actioninfos;

import com.hematac.fencingstats.models.boutinfos.FencersOfBout;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "piste_zones")
public class PisteZone {
  @Id
  @GeneratedValue
  private long id;
  private FencersOfBout fencerSide;
  private ZoneAreas zoneArea;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public FencersOfBout getFencerSide() {
    return fencerSide;
  }

  public void setFencerSide(FencersOfBout fencerSide) {
    this.fencerSide = fencerSide;
  }

  public ZoneAreas getZoneAres() {
    return zoneArea;
  }

  public void setZoneAres(ZoneAreas zoneAres) {
    this.zoneArea = zoneAres;
  }
}
