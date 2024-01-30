package spring.core.model;

import lombok.Data;

//@Data

public class Employee {
	private String name;
	private int id;
private Address address;
	
	
	public Employee(String name, int id, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	
	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("Employee.setName()");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		System.out.println("Employee.setId()");
	}
	public Employee() {
		super();
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", address=" + address + "]";
	}
	
}
