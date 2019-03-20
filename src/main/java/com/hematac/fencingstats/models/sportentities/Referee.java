package com.hematac.fencingstats.models.sportentities;

import com.hematac.fencingstats.models.boutinfos.Bout;
import com.hematac.fencingstats.models.userhandling.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "referees")
public class Referee {

  @Id
  @GeneratedValue
  private long id;

  private String nationality;

  private String licenseInfo; //licensedBy - clubs, federtions??

  @OneToMany(mappedBy = "referee")
  private List<Bout> directedBoutList = new ArrayList<>();

  @OneToMany(mappedBy = "referee",
      cascade = CascadeType.REMOVE)
  private List<RefereeClubAffiliation> refereeClubAffiliationHistory;

  @OneToMany(mappedBy = "referee",
      cascade = CascadeType.REMOVE)
  private List<RefereeCoachAffiliation> refereeCoachAffiliationHistory;

  @OneToOne(mappedBy = "iAmaReferee", cascade = CascadeType.ALL,
      fetch = FetchType.LAZY)
  private User user;

  private int rating; //for later consideration :-O
}
