package com.ust;

public class Employee {
	
	int eId;
	String eName;
	int age;
	String desg;
	double basicPay;
	String mail;
	String mobilenum;
	String address;
	String dept;
	
	public double calculateSalary(double basicPay ) {
		return basicPay+10000;
	}

	public Employee() {
		super();
	}

	public Employee(int eId, String eName, int age, String desg, double basicPay, String mail, String mobilenum,
			String address, String dept) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.age = age;
		this.desg = desg;
		this.basicPay = basicPay;
		this.mail = mail;
		this.mobilenum = mobilenum;
		this.address = address;
		this.dept = dept;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMobilenum() {
		return mobilenum;
	}

	public void setMobilenum(String mobilenum) {
		this.mobilenum = mobilenum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", age=" + age + ", desg=" + desg + ", basicPay="
				+ basicPay + ", mail=" + mail + ", mobilenum=" + mobilenum + ", address=" + address + ", dept=" + dept
				+ "]";
	}
	
	
	

}
