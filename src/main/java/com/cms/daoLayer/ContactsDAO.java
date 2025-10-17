package com.cms.daoLayer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cms.entities.Contacts;

@Repository
public interface ContactsDAO extends JpaRepository<Contacts, Integer>{

}
