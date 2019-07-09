package com.hematac.fencingstats.models.userhandling;

import com.hematac.fencingstats.models.sportentities.Coach;
import com.hematac.fencingstats.models.sportentities.Fencer;
import com.hematac.fencingstats.models.sportentities.Referee;
import com.hematac.fencingstats.models.sportentities.Weapon;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue
  private long id;

  private String userName;
  private String firstName;
  private String middleName;
  private String lastName;
  private String email;
  private String address;
  private String phone;
  private String aboutMe;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "fencer_id")
  private Fencer iAmaFencer;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "referee_id")
  private Referee iAmaReferee;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "coach_id")
  private Coach iAmaCoach;

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

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
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

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getAboutMe() {
    return aboutMe;
  }

  public void setAboutMe(String aboutMe) {
    this.aboutMe = aboutMe;
  }

  public Fencer getiAmaFencer() {
    return iAmaFencer;
  }

  public void setiAmaFencer(Fencer iAmaFencer) {
    this.iAmaFencer = iAmaFencer;
  }

  public Referee getiAmaReferee() {
    return iAmaReferee;
  }

  public void setiAmaReferee(Referee iAmaReferee) {
    this.iAmaReferee = iAmaReferee;
  }

  public Coach getiAmaCoach() {
    return iAmaCoach;
  }

  public void setiAmaCoach(Coach iAmaCoach) {
    this.iAmaCoach = iAmaCoach;
  }

  public Set<User> getAllowsAccessTo() {
    return allowsAccessTo;
  }

  public void setAllowsAccessTo(Set<User> allowsAccessTo) {
    this.allowsAccessTo = allowsAccessTo;
  }

  public Set<User> getIsAllowedAccessTo() {
    return isAllowedAccessTo;
  }

  public void setIsAllowedAccessTo(Set<User> isAllowedAccessTo) {
    this.isAllowedAccessTo = isAllowedAccessTo;
  }
}
