package com.hematac.fencingstats.dtos;

import com.hematac.fencingstats.models.userhandling.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class OAuth2UserInfo implements  UserDetails {

  private String id;
  private String name;
  private String email;
  private String imageUrl;
  private String password = "password";

  private Collection<? extends GrantedAuthority> authorities;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public OAuth2UserInfo(){}

  public OAuth2UserInfo(String id, String email, String password, Collection<? extends GrantedAuthority> authorities){
    this.id = id;
    this.email = email;
    this.password = password;
    this.authorities = authorities;
  }

  public static OAuth2UserInfo create(User user, Set<GrantedAuthority> authorities) {
//    List<GrantedAuthority> authorities = Collections.
//        singletonList(new SimpleGrantedAuthority("ROLE_USER"));

    return new OAuth2UserInfo(
        String.valueOf(user.getId()),
        user.getEmail(),
        "password",
        authorities
    );
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return null;
  }

  @Override
  public String getPassword() {
    return password;
  }

  @Override
  public String getUsername() {
    return email;
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }
}
