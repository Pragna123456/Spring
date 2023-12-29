package com.sathya;

import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class MobileBean {

    public JdbcTemplate jt;

    public void setJt(JdbcTemplate jt) {
        this.jt = jt;
    }

    public void createTable() {
        jt.execute("create table mobile1("
                + "mId number(10) primary key,"
                + "mName varchar2(30),"
                + "cName varchar2(30),"
                + "price number,"
                + "ram number(20),"
                + "rom number(20),"
                + "os varchar2(20),"
                + "processor number(20)"
                + ")");
        System.out.println("new table is created");
    }
    
    public void insertData()
	{
	 int i=	jt.update("insert into mobile1 values(110,'rshiapp','ac',200,1,2,'aaa',11)");
		System.out.println(i+"inserted data succesfully");
	}
    
    public void updateData()
	{
	 int i2=jt.update("update mobile1 set mName='oppo1', os='oppo11' where mId=103");
		System.out.println(i2+"updated data succesfully");
	}
    

	public void deleteData()
	{
	 int i1=jt.update("delete from mobile1 where mId=107");
		System.out.println(i1+"deleted data succesfully");
	}
    
	
	public void findById()
	{
		List l=jt.queryForList("select * from mobile1 where mId=101");
		Iterator it=l.iterator();
		 while (it.hasNext())
		 {
			Object ob=it.next();
			System.out.println(ob.toString());
		}
	}
	public void findAll()
	{
		List l=jt.queryForList("select * from mobile1");
		Iterator it=l.iterator();
		 while (it.hasNext())
		 {
			Object obj=it.next();
			System.out.println(obj.toString());
		}
}

}
