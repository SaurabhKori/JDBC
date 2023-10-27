package ins_upd_del;

import java.util.Scanner;

public class Upd {
	public static String update() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a table name");
		String tabname=sc.nextLine();
		
		System.out.println("Enter a Id number");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("do you want to change?");
		System.out.println(" 1.If you change all details->press *");
		System.out.println(" 2.if you change name->press 1");
		System.out.println(" 3.if you change email->press 2");
		System.out.println(" 4.if you change phone number->press 3 ");
		System.out.println(" 5.if you change name email->press 4 ");
		System.out.println(" 6.if you change name  phone number->press 5 ");
		System.out.println(" 7.if you change phonenumber email->press 6 ");
		System.out.println("Enter your choice");
		String ch=sc.nextLine();
//		switch(ch){
		
//		case "*":
		    if(ch.equals("*")){
			System.out.println("Enter a Name");
			String name=sc.nextLine();
			System.out.println("Enter a Email");
			String email=sc.nextLine();
			System.out.println("Enter a Phone Number");
			long phone=sc.nextLong();
			sc.nextLine();
			String ud="Update "+tabname+" set name ='"+name+"',email ='"+email+"', phone ="+phone+" where id="+id;
			return ud;
		    }
		    else if(ch.equals("1")) {
		    	System.out.println("Enter a Name");
				String name=sc.nextLine();
				String ud="Update "+tabname+" set name ='"+name+"'where id= "+id;
				return ud;
		    	}
		    else if(ch.equals("2")) {
		    	System.out.println("Enter a Email");
				String email=sc.nextLine();
				String ud="Update "+tabname+" set email ='"+email+"'where id= "+id;
				return ud;
		    }
		    else if(ch.equals("3")) {
		    	System.out.println("Enter a Phone Number");
				long phone=sc.nextLong();
				sc.nextLine();
		    	String ud="Update "+tabname+" set phone ="+phone+" where id="+id;
				return ud;
		    }
		    else if(ch.equals("4")) {
		    	System.out.println("Enter a Name");
				String name=sc.nextLine();
				System.out.println("Enter a Email");
				String email=sc.nextLine();
				String ud="Update "+tabname+" set name ='"+name+"', email ='"+email+"' where id= "+id;
				return ud;
		    }
		    else if(ch.equals("5")) {
		    	System.out.println("Enter a Name");
				String name=sc.nextLine();
				System.out.println("Enter a Phone Number");
				long phone=sc.nextLong();
				sc.nextLine();
		    	String ud="Update "+tabname+" set name ='"+name+"', phone = "+phone+" where id= "+id;
				return ud;
		    }
		    else if(ch.equals("6")) {
		    	System.out.println("Enter a Email");
				String email=sc.nextLine();
				System.out.println("Enter a Phone Number");
				long phone=sc.nextLong();
				sc.nextLine();
				String ud="Update "+tabname+" set email ='"+email+"', phone = "+phone+" where id= "+id;
				return ud;
				
				
		    }
		    else {
		    	String x="Icorrect data";
		    	return x;
		    }
		
	
	}

}
