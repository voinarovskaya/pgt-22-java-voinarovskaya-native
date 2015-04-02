package com.example.fw;

public class Contact {

	public String firthname;
	public String lastname;

	public Contact setFirthName(String firthname) {
		this.firthname = firthname;
		return this;
	}

	public Contact setLastname(String lastname) {
		this.lastname = lastname;
		return this;		
	}

	public String getFirthname() {
		return firthname;
	}

	public String getLastname() {
		return lastname;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((firthname == null) ? 0 : firthname.hashCode());
		result = prime * result
				+ ((lastname == null) ? 0 : lastname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		if (firthname == null) {
			if (other.firthname != null)
				return false;
		} else if (!firthname.equals(other.firthname))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		return true;
	}

	

}
