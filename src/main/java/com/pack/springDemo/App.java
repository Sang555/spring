package com.pack.springDemo;

import java.util.ResourceBundle;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App 
{
    public static void main( String[] args )
    {
       Resource resource=new ClassPathResource("beans.xml");
       BeanFactory factory=new XmlBeanFactory(resource);
       Scanner scanner= new Scanner(System.in);
       System.out.println("---------------------------");
       System.out.println("1.MAN");
       System.out.println("2.WOMAN");
       System.out.println("---------------------------");
       String op=scanner.next();
       Human obj =(Human)factory.getBean(op);
       System.out.println(obj);
       
    }
}
