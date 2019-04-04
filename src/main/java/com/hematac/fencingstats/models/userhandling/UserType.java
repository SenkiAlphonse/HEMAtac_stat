package com.hematac.fencingstats.models.userhandling;

public enum UserType {
  GOOGLE("GOOGLE"),
  FACEBOOK("FACEBOOK");


  private final String userTypeName;

  UserType(String userTypeName) {
    this.userTypeName = userTypeName;
  }

  @Override
  public String toString() {
    return this.userTypeName;
  }

  public static UserType fromString(String userTypeName) {
    for (UserType userTypes : UserType.values()) {
      if (userTypes.toString().equals(userTypeName)) {
        return userTypes;
      }
    }
    return null;
  }
}
