package com.hematac.fencingstats.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;

//GFA SpringSecurity workshop: https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/authentication/java.md
@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/", "/login", "/error")
                .permitAll()
                .antMatchers("/svc/**").hasRole("USER")
                .antMatchers("/api/**").hasRole("ADMIN")
                .and()
                .formLogin()
                .and().logout()
                .and().csrf().disable();
    }

    // with predefined users
    //https://stackoverflow.com/questions/49654143/spring-security-5-there-is-no-passwordencoder-mapped-for-the-id-null?rq=1
    @Autowired
    public void configureInMemory(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("alphonse").password("{noop}senki").roles("USER")
                .and()
                .withUser("senki").password("{noop}alphonse").roles("USER", "ADMIN");
    }

    // with a users table
    @Autowired
    public void configureMySql(AuthenticationManagerBuilder auth, DataSource dataSource) throws Exception {
        auth.jdbcAuthentication().dataSource(dataSource)
                .usersByUsernameQuery("select username, password, 1 from users where user_name=?")
                .authoritiesByUsernameQuery("select username, role from users where user_name=?");
    }
}
