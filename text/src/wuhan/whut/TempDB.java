package wuhan.whut;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class TempDB {
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		//加载数据库驱动
		Class.forName("com.mysql.jdbc.Driver");
		//URL数据库连接字符串
		String url = "jdbc:mysql://localhost:3306/temp?useUnicode=true&characterEncoding=UTF-8";
		String user="root";
		String password="";
		//建立数据库连接
		Connection conn=DriverManager.getConnection(url,user,password);
		//创建语句对象
		Statement st=conn.createStatement();
		//执行数据库操作处理查询结构
		//1、数据库增删改，不需要返回结果
		String sql="insert into temp1 values('003','lisi','上海')";
		st.executeUpdate(sql);
		//String sql1="delete from temp1 where name='lisi'";
		//st.executeUpdate(sql1);
		//String sql2="update temp1 set name='hjq',address ='wuhan' WHERE id=1";
		//st.executeUpdate(sql2);
	}

}
