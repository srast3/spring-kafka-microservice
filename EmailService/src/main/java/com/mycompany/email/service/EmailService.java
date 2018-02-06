package com.mycompany.email.service;

import com.mycompany.email.entity.dto.UserDTO;

public interface EmailService {

    void sendSimpleMessage(UserDTO input);
}
