package com.hematac.fencingstats.models.userhandling;

public enum RoleType {
  USER("ROLE_USER"),
  CLUB_ADMIN("ROLE_CLUB_ADMIN"),
  GLOBAL_ADMIN("ROLE_GLOBAL_ADMIN");

  private final String roleName;

  RoleType(String role_name) {
    this.roleName = role_name;
  }

  @Override
  public String toString() {
    return this.roleName;
  }

  public static RoleType fromString(String roleName) {
    for (RoleType roleTypes : RoleType.values()) {
      if (roleTypes.toString().equals(roleName)) {
        return roleTypes;
      }
    }
    return null;
  }
}
