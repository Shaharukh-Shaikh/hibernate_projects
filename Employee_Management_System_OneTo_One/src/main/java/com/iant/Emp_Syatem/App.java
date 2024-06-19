package com.iant.Emp_Syatem;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory Factory = cfg.buildSessionFactory();
        
        Session s=Factory.openSession();
        Emp_Records emp=new Emp_Records();
        emp.setEmp_Id(1);
        emp.setEmp_Name("Shaharukh");
        emp.setLocation("Pune");
         
        
        Department_Records dept=new Department_Records();
        dept.setDept_Id(101);
        dept.setDept_Name("Software Developers");
        emp.setDept(dept);
        
        
        
        Emp_Records emp1=new Emp_Records();
        emp1.setEmp_Id(2);
        emp1.setEmp_Name("priti");
        emp1.setLocation("koregaon");
         
        
        Department_Records dept1=new Department_Records();
        dept1.setDept_Id(102);
        dept1.setDept_Name("Accountant");
        emp1.setDept(dept1);
        
        
        Transaction tr=s.beginTransaction();
        s.save(emp);
        s.save(dept);
        s.save(emp1);
        s.save(dept1);
        
        tr.commit();
        Factory.close(); 
        s.close();
        
    }
}
