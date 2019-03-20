package com.hematac.fencingstats.models.sportentities;

import javax.persistence.*;
import java.util.List;
import java.util.Locale;

@Entity
@Table(name = "clubs")
public class Club {

  @Id
  @GeneratedValue
  private long id;

  private String name;

  private Locale nationality;

  @OneToMany(mappedBy = "club",
      cascade = CascadeType.REMOVE)
  private List<FencerClubAffiliation> fencerClubAffiliationHistory;

  @OneToMany(mappedBy = "club",
      cascade = CascadeType.REMOVE)
  private List<CoachClubAffiliation> coachClubAffiliationHistory;

  @OneToMany(mappedBy = "club",
      cascade = CascadeType.REMOVE)
  private List<RefereeClubAffiliation> refereeClubAffiliationHistory;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public List<FencerClubAffiliation> getFencerClubAffiliationHistory() {
    return fencerClubAffiliationHistory;
  }

  public void setFencerClubAffiliationHistory(List<FencerClubAffiliation> fencerClubAffiliationHistory) {
    this.fencerClubAffiliationHistory = fencerClubAffiliationHistory;
  }

  public List<CoachClubAffiliation> getCoachClubAffiliationHistory() {
    return coachClubAffiliationHistory;
  }

  public void setCoachClubAffiliationHistory(List<CoachClubAffiliation> coachClubAffiliationHistory) {
    this.coachClubAffiliationHistory = coachClubAffiliationHistory;
  }

  public List<RefereeClubAffiliation> getRefereeClubAffiliationHistory() {
    return refereeClubAffiliationHistory;
  }

  public void setRefereeClubAffiliationHistory(List<RefereeClubAffiliation> refereeClubAffiliationHistory) {
    this.refereeClubAffiliationHistory = refereeClubAffiliationHistory;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Locale getNationality() {
    return nationality;
  }

  public void setNationality(Locale nationality) {
    this.nationality = nationality;
  }
}
