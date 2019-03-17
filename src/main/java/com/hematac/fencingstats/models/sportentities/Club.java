package com.hematac.fencingstats.models.sportentities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "clubs")
public class Club {

  @Id
  @GeneratedValue
  private long id;

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
}
