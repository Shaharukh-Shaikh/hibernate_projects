package com.iant.Post_Comment_OneToMany;

import java.util.ArrayList;
import java.util.List;

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
        cfg.addAnnotatedClass(Post.class);
        cfg.addAnnotatedClass(Comments.class);
        SessionFactory sf=cfg.buildSessionFactory();
        
        
        Session s=sf.openSession();
        
        Post p=new Post();
        p.setPost_Id(1);
        p.setPost_Name("First Post");
        
        Comments c1=new Comments();
        c1.setCom_Id(101);
        c1.setCom_Name("kadakkkk");
        
        Comments c2=new Comments();
        c2.setCom_Id(102);
        c2.setCom_Name("euuuu hawa");
        
        Comments c3=new Comments();
        c3.setCom_Id(103);
        c3.setCom_Name("nice photo");
        
        List<Comments> cm=new ArrayList<Comments>();
        cm.add(c1);
        cm.add(c2);
        cm.add(c3);
        p.setCom(cm);
        
        
        Transaction tr = s.beginTransaction();
        s.save(p);
        s.save(c1);
        s.save(c2);
        s.save(c3);
        
        
        
        
        tr.commit();
        s.close();
        
        
        
        
    }
}
