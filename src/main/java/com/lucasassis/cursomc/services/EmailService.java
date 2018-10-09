package com.lucasassis.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.lucasassis.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
