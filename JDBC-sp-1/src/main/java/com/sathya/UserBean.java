package com.sathya;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserBean 
{
  public JdbcTemplate jt;
  
  public void setJt(JdbcTemplate jt)
  {
	 this.jt=jt ;
	 
  }
	public void createTable()
	{
		jt.execute("create table user1(id number(10),name varchar2(30),email varchar2(30))");
		System.out.println("new table is created");
	}
	
	/**public void insertData()
	{
	 int i=	jt.update("insert into user1 values(103,'rushi','rushifr@123.com')");
		System.out.println(i+"inserted data succesfully");
	}**/
	
	/**public void insertData(int userId, String userName, String userEmail) {
	        // Assuming jt is an instance of JdbcTemplate or some other database access class
	        int i = jt.update("INSERT INTO user1 VALUES(?, ?, ?)", userId, userName, userEmail);
	        System.out.println(i + " inserted data successfully");
	    }**/
	
	

    public void insertData(int userId, String userName, String userEmail) {
        int i = jt.update("INSERT INTO user1 VALUES(?, ?, ?)", userId, userName, userEmail);
        System.out.println(i + " inserted data successfully");
    }

    public void insertDataFromUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter user ID: ");
        int userId = scanner.nextInt();

        scanner.nextLine();  // Consume the newline character

        System.out.print("Enter user name: ");
        String userName = scanner.nextLine();

        System.out.print("Enter user email: ");
        String userEmail = scanner.nextLine();

        insertData(userId, userName, userEmail);
    }


	public void deleteData()
	{
	 int i1=jt.update("delete from user1 where id=103");
		System.out.println(i1+"deleted data succesfully");
	}
	
	public void updateData()
	{
	 int i2=jt.update("update user1 set name='navi', email='navi@12.com' where id=102");
		System.out.println(i2+"updated data succesfully");
	}
	
	public void findById()
	{
		List l=jt.queryForList("select * from user1 where id=101");
		Iterator it=l.iterator();
		 while (it.hasNext())
		 {
			Object ob=it.next();
			System.out.println(ob.toString());
		}
	}
	
		 public void findAll()
			{
				List l=jt.queryForList("select * from user1");
				Iterator it=l.iterator();
				 while (it.hasNext())
				 {
					Object obj=it.next();
					System.out.println(obj.toString());
				}
	}

}
