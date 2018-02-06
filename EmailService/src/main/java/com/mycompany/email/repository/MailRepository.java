package com.mycompany.email.repository;

import org.springframework.data.repository.CrudRepository;

import com.mycompany.email.entity.Mail;


public interface MailRepository extends CrudRepository<Mail, Long> {

}