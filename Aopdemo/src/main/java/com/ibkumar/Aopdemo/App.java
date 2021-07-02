package com.ibkumar.Aopdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("aopconfig.xml");
       BankAccount account = context.getBean("bankAccount",BankAccount.class);
       
       //account.withdraw(2000);
       account.miniStatement();
       
     //  System.out.println(account.getBalance());
    }
}
