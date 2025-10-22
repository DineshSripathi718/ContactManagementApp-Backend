package com.cms.controlLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cms.entities.Contacts;
import com.cms.serviceLayer.ContactsService;

@RestController
@CrossOrigin(origins = "https://bdcontactmanagementapp.netlify.app/")
//@CrossOrigin(origins = "http://127.0.0.1:3000")
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
	
	@PutMapping("/update")
	public String updateContact(@RequestBody Contacts contact) {
		return contactService.updateContact(contact);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteContact(@PathVariable("id") int id) {
		return contactService.deleteContact(id);
	}
}
