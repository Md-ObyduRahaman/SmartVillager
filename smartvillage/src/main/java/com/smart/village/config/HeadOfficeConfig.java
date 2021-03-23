package com.smart.village.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class HeadOfficeConfig extends WebSecurityConfigurerAdapter {

   
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("ramesh").password("ramesh").roles("head");
    }
    
  /// configure method... 	
  	@Override
  	protected void configure(HttpSecurity http) throws Exception {
  		http.authorizeRequests().antMatchers("/head/**").hasRole("head")
  				.antMatchers("/**").permitAll().and().formLogin()
  				.loginPage("/head")
  				.loginProcessingUrl("/dologin")
  				.defaultSuccessUrl("/user/index")				
  				.and().csrf().disable();
  	}
}