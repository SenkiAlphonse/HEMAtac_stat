package com.hematac.fencingstats.models.boutinfos;

import com.hematac.fencingstats.models.sportentities.Weapon;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "events")
public class Event {

  @Id
  @GeneratedValue
  private long id;

  private String name;

  @ManyToMany(cascade = {
      CascadeType.PERSIST,
      CascadeType.MERGE,
      CascadeType.REFRESH
  })
  @JoinTable(name = "event_weapon",
      joinColumns = @JoinColumn(name = "event_id"),
      inverseJoinColumns = @JoinColumn(name = "weapon_id")
  )
  private List<Weapon> weapons = new ArrayList<>();


}
