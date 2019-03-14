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
  private List<ClubAffiliation> clubAffiliationHistory;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public List<ClubAffiliation> getClubAffiliationHistory() {
    return clubAffiliationHistory;
  }

  public void setClubAffiliationHistory(List<ClubAffiliation> clubAffiliationHistory) {
    this.clubAffiliationHistory = clubAffiliationHistory;
  }
}
