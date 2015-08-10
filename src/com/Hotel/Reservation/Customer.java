package com.Hotel.Reservation;

import java.util.Scanner;

public class Customer {
	int no;
	String name;
	String bookingno;
//	int indate;
//	int outdate;
	int nod,type,ld,d;
	boolean status;
	
	Customer()
	{
		no=-1;
		name=null;
		bookingno=null;
		nod=type=ld=d=-1;
		status=false;
	}
	
	public void setInitialDetails(int c)
	{
		
		no=c;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter name");
		name = in.nextLine();
//		System.out.println("Enter date as a number ex:24");
//		System.out.println("Enter today's date");
//		indate = in.nextInt();
		System.out.println("Enter room type?1 for Luxury,2 for Deluxe,3 for superdeluxe");
	    type = in.nextInt();
	    System.out.println("Enter occupancy? 1/2");
	    ld = in.nextInt();
	    System.out.println("Enter number of days?");
	    d = in.nextInt();
	    
	}
	
	public void setBookingNo(String b)
	{
		bookingno=b;
	}
	
	
}
