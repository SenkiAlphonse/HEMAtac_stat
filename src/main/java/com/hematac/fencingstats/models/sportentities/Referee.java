package com.hematac.fencingstats.models.sportentities;

import com.hematac.fencingstats.models.boutinfos.Bout;
import com.hematac.fencingstats.models.userhandling.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Entity
@Table(name = "referees")
public class Referee {

  @Id
  @GeneratedValue
  private long id;

  private Locale nationality;

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

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Locale getNationality() {
    return nationality;
  }

  public void setNationality(Locale nationality) {
    this.nationality = nationality;
  }

  public String getLicenseInfo() {
    return licenseInfo;
  }

  public void setLicenseInfo(String licenseInfo) {
    this.licenseInfo = licenseInfo;
  }

  public List<Bout> getDirectedBoutList() {
    return directedBoutList;
  }

  public void setDirectedBoutList(List<Bout> directedBoutList) {
    this.directedBoutList = directedBoutList;
  }

  public List<RefereeClubAffiliation> getRefereeClubAffiliationHistory() {
    return refereeClubAffiliationHistory;
  }

  public void setRefereeClubAffiliationHistory(List<RefereeClubAffiliation> refereeClubAffiliationHistory) {
    this.refereeClubAffiliationHistory = refereeClubAffiliationHistory;
  }

  public List<RefereeCoachAffiliation> getRefereeCoachAffiliationHistory() {
    return refereeCoachAffiliationHistory;
  }

  public void setRefereeCoachAffiliationHistory(List<RefereeCoachAffiliation> refereeCoachAffiliationHistory) {
    this.refereeCoachAffiliationHistory = refereeCoachAffiliationHistory;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }
}
