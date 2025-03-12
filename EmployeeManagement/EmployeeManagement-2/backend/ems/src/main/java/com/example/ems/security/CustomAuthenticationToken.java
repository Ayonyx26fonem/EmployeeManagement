package com.example.ems.security;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.Collection;

public class CustomAuthenticationToken extends AbstractAuthenticationToken {
    private final UserDetails userDetails;

    public CustomAuthenticationToken(UserDetails userDetails, Collection<? extends GrantedAuthority> authorities) {
        super(authorities);
        this.userDetails = userDetails;
        setAuthenticated(true);
    }

    @Override
    public Object getCredentials() {
        return null; // No credentials needed after authentication
    }

    @Override
    public Object getPrincipal() {
        return userDetails;
    }
}
