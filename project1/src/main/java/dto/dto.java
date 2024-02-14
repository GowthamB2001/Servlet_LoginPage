package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class dto {
	@Id
	private String name;
	private int rollnumber;
	private String cls;
	private String address;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getCls() {
		return cls;
	}
	public void setCls(String cls) {
		this.cls = cls;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "dto [name=" + name + ", rollnumber=" + rollnumber + ", cls=" + cls + ", address=" + address + ", email="
				+ email + "]";
	}
	

	}
	


