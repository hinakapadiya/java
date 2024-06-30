package excercise;
import java.util.*;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

		String name;
		String add;
		String tno;
		String mno;
		String hfm;
		int uid;
		
		Scanner sc=new Scanner(System.in);
		
		
		PersonClass [] arr;
		arr=new PersonClass[5];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter Name=");
			name=sc.nextLine();
			
			System.out.println("Enter Adress=");
			add=sc.nextLine();
			
			System.out.println("Enter mobile no=");
			mno=sc.nextLine();
			
			System.out.println("Enter telephone  no=");
			tno=sc.nextLine();
			
			System.out.println("Enter Head of family=");
			hfm=sc.nextLine();
			
			System.out.println("Enter Uid=");
			uid=sc.nextInt();
			
			arr[i]=new PersonClass(name,add,tno,mno,hfm,uid);
			/*arr[i].setName(name);
			arr[i].setAddress(add);
			arr[i].setNo(tno);
			arr[i].setMno(mno);
			arr[i].setHeadofFamily(hfm);
			arr[i].setUid(uid);*/
			System.out.println(arr[i]);
			
			
		}
	}

}
