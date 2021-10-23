package com.studenttechnique;

public class User {

	private String name;
	private String sex;
	private String address;
	private int age;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String name, String sex, String address, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.address = address;
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", sex=" + sex + ", address=" + address + ", age=" + age + "]";
	}
}
