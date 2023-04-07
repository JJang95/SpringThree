package org.genspark;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Student student = (Student) context.getBean("student");

        System.out.println(student.getId() + " " + student.getName() + " " + student.getPhones() + " " + student.getAddress());
    }
}
