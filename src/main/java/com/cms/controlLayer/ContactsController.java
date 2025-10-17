package com.cms.controlLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cms.entities.Contacts;
import com.cms.serviceLayer.ContactsService;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:3000")
@RequestMapping("/contact")
public class ContactsController {
	@Autowired
	private ContactsService contactService;
	
	@GetMapping("/all")
	public List<Contacts> getAllContacts(){
		return contactService.getAllContacts();
	}
	
	@GetMapping("/{id}")
	public Contacts getContactById(@PathVariable("id") int id) {
		return contactService.getContactById(id);
	}
}
