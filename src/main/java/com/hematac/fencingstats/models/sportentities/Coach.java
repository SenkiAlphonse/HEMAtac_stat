package com.hematac.fencingstats.models.sportentities;

import com.hematac.fencingstats.models.userhandling.User;

import javax.persistence.*;
import java.util.List;
import java.util.Locale;

@Entity
@Table(name = "coaches")
public class Coach {
  @Id
  @GeneratedValue
  private long id;

  private String firstName;
  private String middleName;
  private String lastName;

  private  Handedness handedness;

  private Locale nationality;

  private String diplomaId;

  private String diplomaTitle;

  private String diplomaIssuer;

  @OneToMany(mappedBy = "coach",
      cascade = CascadeType.REMOVE)
  private List<FencerCoachAffiliation> fencerCoachAffiliationHistory;

  @OneToMany(mappedBy = "coach",
      cascade = CascadeType.REMOVE)
  private List<RefereeCoachAffiliation> refereeCoachAffiliationHistory;

  @OneToMany(mappedBy = "coach",
      cascade = CascadeType.REMOVE)
  private List<CoachClubAffiliation> coachClubAffiliationHistory;

  @OneToMany(mappedBy = "coach",
      cascade = CascadeType.REMOVE)
  private List<CoachTeamAffiliation> coachTeamAffiliationHistory;

  @OneToOne(mappedBy = "iAmaCoach", cascade = CascadeType.ALL,
      fetch = FetchType.LAZY)
  private User user;

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

  public String getDiplomaId() {
    return diplomaId;
  }

  public void setDiplomaId(String diplomaId) {
    this.diplomaId = diplomaId;
  }

  public String getDiplomaTitle() {
    return diplomaTitle;
  }

  public void setDiplomaTitle(String diplomaTitle) {
    this.diplomaTitle = diplomaTitle;
  }

  public String getDiplomaIssuer() {
    return diplomaIssuer;
  }

  public void setDiplomaIssuer(String diplomaIssuer) {
    this.diplomaIssuer = diplomaIssuer;
  }

  public List<FencerCoachAffiliation> getFencerCoachAffiliationHistory() {
    return fencerCoachAffiliationHistory;
  }

  public void setFencerCoachAffiliationHistory(List<FencerCoachAffiliation> fencerCoachAffiliationHistory) {
    this.fencerCoachAffiliationHistory = fencerCoachAffiliationHistory;
  }

  public List<RefereeCoachAffiliation> getRefereeCoachAffiliationHistory() {
    return refereeCoachAffiliationHistory;
  }

  public void setRefereeCoachAffiliationHistory(List<RefereeCoachAffiliation> refereeCoachAffiliationHistory) {
    this.refereeCoachAffiliationHistory = refereeCoachAffiliationHistory;
  }

  public List<CoachClubAffiliation> getCoachClubAffiliationHistory() {
    return coachClubAffiliationHistory;
  }

  public void setCoachClubAffiliationHistory(List<CoachClubAffiliation> coachClubAffiliationHistory) {
    this.coachClubAffiliationHistory = coachClubAffiliationHistory;
  }

  public List<CoachTeamAffiliation> getCoachTeamAffiliationHistory() {
    return coachTeamAffiliationHistory;
  }

  public void setCoachTeamAffiliationHistory(List<CoachTeamAffiliation> coachTeamAffiliationHistory) {
    this.coachTeamAffiliationHistory = coachTeamAffiliationHistory;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Handedness getHandedness() {
    return handedness;
  }

  public void setHandedness(Handedness handedness) {
    this.handedness = handedness;
  }
}
