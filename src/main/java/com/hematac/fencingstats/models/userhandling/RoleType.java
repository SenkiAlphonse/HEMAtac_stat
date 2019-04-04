package com.hematac.fencingstats.models.userhandling;

public enum RoleType {
  USER("USER"),
  CLUB_ADMIN("CLUB_ADMIN"),
  GLOBAL_ADMIN("GLOBAL_ADMIN");

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
