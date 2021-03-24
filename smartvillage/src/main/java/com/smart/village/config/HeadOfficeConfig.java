package com.smart.village.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class HeadOfficeConfig extends WebSecurityConfigurerAdapter {

   
	 @Override
	    protected void configure(AuthenticationManagerBuilder auth) 
	      throws Exception {
	        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
	        auth.inMemoryAuthentication()
	          .withUser("sojib")
	          .password(encoder.encode("123"))
	          .roles("head");
	    }
    
  /// configure method... 	
  	@Override
  	protected void configure(HttpSecurity http) throws Exception {
  		http.authorizeRequests().antMatchers("/head/**").hasRole("head")
  				.antMatchers("/**").permitAll().and().formLogin() 
  				.loginProcessingUrl("/head")
  				.defaultSuccessUrl("/trail")				
  				.and().csrf().disable();
  	}
}