package com.residencia.ecommerce.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class SenderMailService {

    @Autowired
    private JavaMailSender mailSender;

    public void enviar(String destino, String assunto, String mensagem) {
        SimpleMailMessage email = new SimpleMailMessage();
        email.setTo(destino/*"teste@gmail.com"*/);
        email.setSubject(assunto/*"Teste envio de e-mail"*/);
        email.setText(mensagem/*"Enviei este e-mail usando Spring Boot."*/);
        mailSender.send(email);
    }
}
