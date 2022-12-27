package com.practice.map;

public class College {

	private String registrationNumber;

	public College(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	@Override
	public int hashCode() {
		System.out.println("hashcode method called");
		final int prime = 31;
		int result = 1;
		result = prime * result + ((registrationNumber == null) ? 0 : registrationNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals method called"); // return false;

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		College other = (College) obj;
		if (registrationNumber == null) {
			if (other.registrationNumber != null)
				return false;
		} else if (!registrationNumber.equals(other.registrationNumber))
			return false;
		return true;

	}

}
