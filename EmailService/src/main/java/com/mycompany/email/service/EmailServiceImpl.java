package com.mycompany.email.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import com.mycompany.email.entity.Mail;
import com.mycompany.email.entity.dto.UserDTO;
import com.mycompany.email.repository.MailRepository;

@Component
public class EmailServiceImpl implements EmailService {

    @Autowired
    public JavaMailSender emailSender;

    @Autowired
    public MailRepository mailRepository;

    @Override
    public void sendSimpleMessage(UserDTO input) {
        try {

            Mail newMail = new Mail();
            newMail.setTo(input.getUserName());
            newMail.setSubject("Registration Success");
            newMail.setText("Welcome, You have successfully registered!");

            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(newMail.getTo());
            message.setSubject(newMail.getSubject());
            message.setText(newMail.getText());

            mailRepository.save(newMail);
            emailSender.send(message);
        } catch (MailException exception) {
            exception.printStackTrace();
        }

    }
}
