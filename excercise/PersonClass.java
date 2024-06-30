package excercise;

public class PersonClass {
	/*
	 Write a program to create a directory that contains the following information.
(a) Name of a person
(b) Address
(c) Telephone Number (if available with STD code)
(d) Mobile Number (if available)
(e) Head of the family
(f) Unique ID No.
The program will support the following menu based activities:
(a) Create a database entry (The Unique ID number must be unique for every entry, the telephone numbers of two or more persons can be same if and only if the head of family is same)
(b) Edit an entry (M
entry (Must be identified by only the Unique ID number)
	 */

	private String name;
	private String address;
	private String no;
	private String mno;
	private String HeadofFamily;
	private int uid;
	public PersonClass(String name, String address, String no, String mno, String headofFamily, int uid) {
		super();
		this.name = name;
		this.address = address;
		this.no = no;
		this.mno = mno;
		HeadofFamily = headofFamily;
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getMno() {
		return mno;
	}
	public void setMno(String mno) {
		this.mno = mno;
	}
	public String getHeadofFamily() {
		return HeadofFamily;
	}
	public void setHeadofFamily(String headofFamily) {
		HeadofFamily = headofFamily;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	@Override
	public String toString() {
		return "PersonClass [name=" + name + ", address=" + address + ", no=" + no + ", mno=" + mno + ", HeadofFamily="
				+ HeadofFamily + ", uid=" + uid + "]";
	}
	
	
	
	
}
