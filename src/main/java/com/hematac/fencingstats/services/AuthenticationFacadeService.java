package com.hematac.fencingstats.services;

import org.springframework.security.core.Authentication;

public interface AuthenticationFacadeService {

  Authentication getAuthentication();
}
