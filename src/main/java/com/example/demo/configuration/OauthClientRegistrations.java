package com.example.demo.configuration;

import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.core.AuthorizationGrantType;
import org.springframework.security.oauth2.core.ClientAuthenticationMethod;

public class OauthClientRegistrations {

	ClientRegistration githubOauthRegistration() {
		return ClientRegistration.withRegistrationId("github").clientId("a27cd281aba4f41074a8")
				.clientSecret("e12e28a2f66e6e14f685c3df3c02bae0c2a5eb6e")
				.authorizationUri("https://github.com/login/oauth/authorize")
				.redirectUri("http://localhost:8080/login/oauth2/code/github")
				.authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
				.tokenUri("https://github.com/login/oauth/access_token")
				.scope("read:user", "user:email", "read:project")
				.clientAuthenticationMethod(ClientAuthenticationMethod.CLIENT_SECRET_POST)
				.userInfoUri("https://api.github.com/user")
				.userNameAttributeName("id")
				.build();
	}
}
