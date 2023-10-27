package ins_upd_del;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Insert{
	public static String insert() throws InputMismatchException {
		    Scanner sc = new Scanner(System.in);
			System.out.println("Enter a table name");
			String tabname=sc.nextLine();
			System.out.println("Enter a id number");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter a name");
			String name=sc.nextLine();
			System.out.println("Enter a Email");
			String email=sc.nextLine();
			System.out.println("Enter your Mobile number");
			long phone=sc.nextLong();
			String ins="INSERT into "+tabname+" values("+id+",'"+name+"','"+email+"',"+phone+")";
			return ins;
		}

}
