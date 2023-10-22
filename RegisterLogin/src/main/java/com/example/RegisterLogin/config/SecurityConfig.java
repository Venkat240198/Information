package com.example.RegisterLogin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Bean
	// authentication
	public UserDetailsService userDetailsService(PasswordEncoder pass) {

		UserDetails admin = User.withUsername("venkat").password(pass.encode("Venkat07")).roles("ADMIN").build();

		UserDetails user = User.withUsername("john").password(pass.encode("John07")).roles("USER").build();
		return new InMemoryUserDetailsManager(admin, user);

	}

	@Bean
	// authorization
	public SecurityFilterChain securityFilter(HttpSecurity http) throws Exception {

		return http.csrf().disable().authorizeHttpRequests()
				.requestMatchers(HttpMethod.POST,"/post/student").permitAll()
				.and()
				.authorizeHttpRequests()
				.requestMatchers(HttpMethod.GET,"/api/**").authenticated()
				.and().httpBasic()
				.and().build();
				

	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
