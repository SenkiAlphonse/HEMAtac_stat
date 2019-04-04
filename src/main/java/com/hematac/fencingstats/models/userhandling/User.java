package com.hematac.fencingstats.models.userhandling;

import com.hematac.fencingstats.models.sportentities.Coach;
import com.hematac.fencingstats.models.sportentities.Fencer;
import com.hematac.fencingstats.models.sportentities.Referee;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue
  private long id;

  private String email;
  private String name;
  private String imageUrl;
  private UserType userType;

  @ManyToMany(fetch = FetchType.EAGER)
  @JoinTable(name = "User_ROLES",
      joinColumns =  @JoinColumn(name ="USER_ID"),inverseJoinColumns= @JoinColumn(name="ROLE_ID"))
  private Set<Role> roles;

  private String firstName;
  private String middleName;
  private String lastName;
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

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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

  public String getImageUrl() {
    return imageUrl;
  }

  public Set<Role> getRoles() {
    return roles;
  }

  public void setRoles(Set<Role> roles) {
    this.roles = roles;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
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

  public UserType getUserType() {
    return userType;
  }

  public void setUserType(UserType userType) {
    this.userType = userType;
  }

  public UserDto toUserDto(){
    UserDto userDto = new UserDto();
    userDto.setId(this.id);
    userDto.setEmail(this.email);
    userDto.setFirstName(this.firstName);
    userDto.setLastName(this.lastName);
    userDto.setUsername(this.username);
    userDto.setRole(this.roles.stream().map(role -> role.getName().toString()).collect(Collectors.toList()));
    return userDto;
  }
}
