package com.hematac.fencingstats.models.userhandling;

import com.hematac.fencingstats.models.sportentities.Coach;
import com.hematac.fencingstats.models.sportentities.Fencer;
import com.hematac.fencingstats.models.sportentities.Referee;
import com.hematac.fencingstats.models.sportentities.Weapon;

import javax.persistence.*;
import java.sql.Ref;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue
  private long id;

  private String firstName;
  private String middleName;
  private String lastName;
  private String email;
  private String address;
  private String phone;
  private String aboutMe;
  private Set<Weapon> analyzedWeapons = new HashSet<>();

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "fencer_id")
  private Fencer fencer;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "referee_id")
  private Referee referee;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "coach_id")
  private Coach coach;

  //users can allow other users to view their stats, e.g. fencers can allow coaches to view their data but it does not have to be bidirectional.
  @ManyToMany
  @JoinTable(name="user_reviewers",
      joinColumns=@JoinColumn(name="studentId"),
      inverseJoinColumns=@JoinColumn(name="instructorId")
  )
  private Set<User> allowsAccessTo;

  @ManyToMany
  @JoinTable(name="user_reviewers",
      joinColumns=@JoinColumn(name="instructorId"),
      inverseJoinColumns=@JoinColumn(name="studentId")
  )
  private Set<User> isAllowedAccessTo;
}
