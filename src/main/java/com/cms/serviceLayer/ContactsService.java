package com.cms.serviceLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.daoLayer.ContactsDAO;
import com.cms.entities.Contacts;

@Service
public class ContactsService {
	
	@Autowired
	private ContactsDAO contactDAO;

	public Contacts saveContact(Contacts contact) {
		return contactDAO.save(contact);
	}

	public List<Contacts> getAllContacts() {
		return contactDAO.findAll();
	}

	public Contacts getContactById(int id) {
		return contactDAO.getReferenceById(id);
	}

}
