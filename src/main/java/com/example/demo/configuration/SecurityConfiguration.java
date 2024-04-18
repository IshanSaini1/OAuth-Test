package com.example.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.cors(t -> t.disable()).csrf(t -> t.disable())
		.authorizeHttpRequests(t -> {
			t.requestMatchers("/").permitAll();
			t.anyRequest().authenticated();
			})
		.oauth2Login(t -> t.clientRegistrationRepository(clientRegistrationRepository())
		);
		return http.build();
	}

	@Bean
	public ClientRegistrationRepository clientRegistrationRepository() {
		return new InMemoryClientRegistrationRepository(new OauthClientRegistrations().githubOauthRegistration());
	}

}
