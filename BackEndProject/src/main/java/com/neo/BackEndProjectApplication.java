package com.neo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.neo.dao.ContactRepository;
import com.neo.entities.Contact;

@SpringBootApplication
public class BackEndProjectApplication implements CommandLineRunner{

	@Autowired
	private ContactRepository contactRepository;
	public static void main(String[] args) {
		SpringApplication.run(BackEndProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
//		contactRepository.save(new Contact("HASSANI", "MOHAMMED", df.parse("12/10/1998"), "mail@mail.com",(long) 669570083, "HASSANI.png"));
//		contactRepository.save(new Contact("ALAMI", "ANAS", df.parse("5/2/1995"), "mail2@mail.com",(long) 669330083, "ALAMI.png"));
//		contactRepository.save(new Contact("THAICHA", "AHMED", df.parse("12/06/1994"), "mail3@mail.com",(long) 663333383, "THAICHA.png"));	contactRepository.save(new Contact("HASSANI", "MOHAMMED", df.parse("12/10/1998"), "mail@mail.com",(long) 669570083, "HASSANI.png"));
//		contactRepository.save(new Contact("ALAMI", "ANAS", df.parse("5/2/1995"), "mail2@mail.com",(long) 669330083, "ALAMI.png"));
//		contactRepository.save(new Contact("THAICHA", "AHMED", df.parse("12/06/1994"), "mail3@mail.com",(long) 663333383, "THAICHA.png"));	contactRepository.save(new Contact("HASSANI", "MOHAMMED", df.parse("12/10/1998"), "mail@mail.com",(long) 669570083, "HASSANI.png"));
//		contactRepository.save(new Contact("ALAMI", "ANAS", df.parse("5/2/1995"), "mail2@mail.com",(long) 669330083, "ALAMI.png"));
//		contactRepository.save(new Contact("THAICHA", "AHMED", df.parse("12/06/1994"), "mail3@mail.com",(long) 663333383, "THAICHA.png"));
//		
		contactRepository.findAll().forEach(c->{System.out.println(c.getNom());});
	}

	
}
