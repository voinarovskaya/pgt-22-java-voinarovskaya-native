package com.example.fw;


public class ContactHelper extends HelperBase{

	public ContactHelper(ApplicationManager manager) {
		super(manager);
		
	}	

	private void initContactCreation() {
		manager.getAutoItHelper()
		.winWaitAndActivate("AddressBook Portable", "", 5000)
		.click("Add").winWaitAndActivate("Add Contact", "", 5000);
	}
	
	private void fiilContactForm(Contact contact) {
		manager.getAutoItHelper()
		.send("TDBEdit12",contact.firthname)
		.send("TDBEdit11",contact.lastname);
	}
	
	public void createContact(Contact contact) {
		initContactCreation();
		fiilContactForm(contact);
		manager.getAutoItHelper()
		.click("Save").winWaitAndActivate("AddressBook Portable", "", 5000);
		
	}

	public Contact getFirthContact() {
		manager.getAutoItHelper()
		.winWaitAndActivate("AddressBook Portable", "", 5000)
		.click("TListView1")
		.send("{DOWN}{SPACE}")
		.click("Edit")
		.winWaitAndActivate("Update Contact", "", 5000);
		Contact contact = new Contact()
		.setFirthName(manager.getAutoItHelper().getText("TDBEdit12"))
		.setLastname(manager.getAutoItHelper().getText("TDBEdit11"));
		manager.getAutoItHelper()
		.click("Cancel").winWaitAndActivate("AddressBook Portable", "", 5000);
		return contact;
		
	}

	

}
