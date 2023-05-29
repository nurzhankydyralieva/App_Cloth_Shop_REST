package com.epam.porject.service;

import com.epam.porject.model.entitity.AuthenticationRequest;
import com.epam.porject.model.entitity.AuthenticationResponse;
import com.epam.porject.model.entitity.RegisterRequest;

public interface AuthenticationService {

    AuthenticationResponse register(RegisterRequest request);

    AuthenticationResponse authenticate(AuthenticationRequest request);
}
