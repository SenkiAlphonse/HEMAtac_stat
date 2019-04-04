package com.hematac.fencingstats.OAuth2;

import com.hematac.fencingstats.dtos.OAuth2UserInfo;
import com.hematac.fencingstats.models.userhandling.User;
import com.hematac.fencingstats.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.oidc.userinfo.OidcUserRequest;
import org.springframework.security.oauth2.client.oidc.userinfo.OidcUserService;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CustomOidcUserService extends OidcUserService {

  private UserRepository userRepository;

  @Autowired
  public CustomOidcUserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public OidcUser loadUser(OidcUserRequest userRequest) throws OAuth2AuthenticationException {
    OidcUser oidcUser = super.loadUser(userRequest);
    Map attributes = oidcUser.getAttributes();
    OAuth2UserInfo userInfo = new OAuth2UserInfo();
    userInfo.setEmail((String) attributes.get("email"));
    userInfo.setId((String) attributes.get("sub"));
    userInfo.setImageUrl((String) attributes.get("picture"));
    userInfo.setName((String) attributes.get("name"));
    updateUser(userInfo);
    return oidcUser;
  }

  protected void updateUser(OAuth2UserInfo userInfo) {
    User user = userRepository.findByEmail(userInfo.getEmail());
    if (user == null) {
      user = new User();
    }
    user.setEmail(userInfo.getEmail());
    user.setImageUrl(userInfo.getImageUrl());
    user.setName(userInfo.getName());

    /*if (System.getenv("GOD_USER").equals(user.getEmail())) {
      user.setUserRole(UserRole.admin);
    } else {
      user.setUserRole(UserRole.user);
    }*/
    userRepository.save(user);
  }
}
