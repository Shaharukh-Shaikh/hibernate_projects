package com.iant.ManyStudent_EnrollManyCourses;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration con=new Configuration();
    	con.configure("hibernate.cfg.xml");
    /*	con.addAnnotatedClass(Courses.class);
    	con.addAnnotatedClass(Student.class);*/
    	SessionFactory Factory = con.buildSessionFactory();
    	Student s1=new Student();
    	s1.setStd_id(1);
    	s1.setStd_name("priti");
    	
      Student s2=new Student();
    	
    	s2.setStd_id(2);
    	s2.setStd_name("Shaharukh");
    	
    	Courses c1=new Courses();
    	c1.setCourses_id(10);
    	c1.setCourses_name("java");
    	
    	Courses c2=new Courses();
    	c2.setCourses_id(20);
    	c2.setCourses_name("python");
    	
    	List<Student> st=new ArrayList<Student>();
    	st.add(s2);
    	st.add(s1);
    	c1.setStd(st);
    	c2.setStd(st);
    	
    	List<Courses> sc=new ArrayList<Courses>();
    	sc.add(c2);
    	sc.add(c1);
    	s1.setCou(sc);
    	s2.setCou(sc);
    	
    	Session s=Factory.openSession();
    	Transaction tr=s.beginTransaction();
    	s.save(c1);
    	s.save(c2);
    	s.save(s1);
    	s.save(s2);
    	tr.commit();
    	s.close();
    	Factory.close();
    	
    	
    	
    	
       
    }
}
