package jdbc_api.jdbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.x.protobuf.MysqlxCrud.Update;

import ins_upd_del.Del;
import ins_upd_del.Insert;
import ins_upd_del.Upd;



public class Connect {
     public static void main(String[] args)  {
    	 Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc.api", "root", "root");
//			System.out.println(con);
			Statement st=con.createStatement();
//			String iq="INSERT into studentsdetails values(106,'jhon','jhon@.com',9000000)";
			String il=Insert.insert();
//			String iq="Update studentsdetails set name='sohan'where id=101";
//			System.out.println(iq);
			String iu=Upd.update();
			String id=Del.delete();
			st.execute(il);
//			st.executeUpdate(id);
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
