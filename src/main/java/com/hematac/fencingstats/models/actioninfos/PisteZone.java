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

  private ZoneAreas zoneAres;
}
