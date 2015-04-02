package com.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.fw.Contact;

public class TestContactCreation extends TestBase{
	
	@Test
	public void shouldCreateContactWithValidData(){
		Contact contact = new Contact().setFirthName("tester").setLastname("tester");
		app.getContactHelper().createContact(contact);
		Contact createdContact = app.getContactHelper().getFirthContact();
		Assert.assertEquals(contact, createdContact);
	}
	

}
