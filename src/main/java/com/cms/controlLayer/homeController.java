package com.cms.controlLayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cms.entities.Contacts;
import com.cms.serviceLayer.ContactsService;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:3000")
public class homeController {
	
	@Autowired
	private ContactsService contactService;
	
	@GetMapping("")
	public String home() {
		return "home page";
	}
	
	@PostMapping("/submit")
	public Contacts addContact(@RequestBody Contacts contact) {
		return contactService.saveContact(contact);
	}
}
