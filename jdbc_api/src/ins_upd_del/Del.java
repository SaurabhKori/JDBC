package ins_upd_del;

import java.util.Scanner;

public class Del {
	public static String delete() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a table name");
		String tabn=sc.nextLine();
		System.out.println("Enter Id ");
		int id=sc.nextInt();
		String del="Delete from "+tabn+" where id="+id;
		return del;
		
	}
   
}
