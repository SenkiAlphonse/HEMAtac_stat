package com.hematac.fencingstats.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.security.oauth2.core.AuthorizationGrantType;
import org.springframework.security.oauth2.core.ClientAuthenticationMethod;
import org.springframework.security.oauth2.core.oidc.IdTokenClaimNames;

@Configuration
public class Outh2LoginConfig {

    @EnableWebSecurity
    public static class Oauth2LoginSecurityConfig extends WebSecurityConfigurerAdapter {

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http
                    .csrf()
                        .disable()
                    .authorizeRequests()
                        .anyRequest().authenticated()
                        .and()
                    .oauth2Login();
        }
    }

    //done by springBoot from application.properties, when used.
    @Bean
    public ClientRegistrationRepository clientRegistrationRepository() {
        return new InMemoryClientRegistrationRepository(this.googleClientRegistration());
    }

    private ClientRegistration googleClientRegistration(){
        return ClientRegistration.withRegistrationId("google")
                .clientId(System.getenv("GOOGLE_CLIENT_ID"))
                .clientSecret(System.getenv("GOOGLE_CLIENT_SECRET"))
                .clientAuthenticationMethod(ClientAuthenticationMethod.BASIC)
                .authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
                .redirectUriTemplate("{baseUrl}/login/oauth2/code/{registrationId}")
                .scope("openid", "profile", "email", "address", "phone")
                .authorizationUri("https://accounts.google.com/o/oauth2/v2/auth")
                .tokenUri("https://www.googleapis.com/oauth2/v4/token")
                .userInfoUri("https://www.googleapis.com/oauth2/v3/userinfo")
                .userNameAttributeName(IdTokenClaimNames.SUB)
                .jwkSetUri("https://www.googleapis.com/oauth2/v3/certs")
                .clientName("Google")
                .build();
    }


}
