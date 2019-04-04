package com.hematac.fencingstats.models.userhandling;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "ROLES")
public class Role {

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  @Column(name = "ID")
  private long id;

  @Enumerated(EnumType.STRING)
  @Column(name = "type")
  private RoleType type;
  @Column(name = "description")
  private String description;
  @Column(name = "created_on")
  private Long createdOn;
  @Column(name = "modified_on")
  private Long modifiedOn;

  @OneToMany(fetch = FetchType.EAGER, mappedBy = "role")
  private Set<User> users;


  public RoleType getType() {
    return type;
  }

  public void setType(RoleType type) {
    this.type = type;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Long getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(Long createdOn) {
    this.createdOn = createdOn;
  }

  public Long getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(Long modifiedOn) {
    this.modifiedOn = modifiedOn;
  }
}
