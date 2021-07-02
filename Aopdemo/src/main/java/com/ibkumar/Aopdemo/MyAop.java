package com.ibkumar.Aopdemo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAop {
	
	@Before("execution(* com.ibkumar.Aopdemo.BankAccount.miniStatement())") // for non-parameterized
	//@After("execution(* com.ibkumar.Aopdemo.BankAccount.withdraw(..))") //for parameterized 
	public void authentication()
	{
		System.out.println("Authentication started ......");
	}
	@After("execution(* com.ibkumar.Aopdemo.BankAccount.miniStatement())")
	public void transactionComplete()
	{
		System.out.println("Thanks");
	}

}

//authentication function = advice - functions those is inside AOP program is called advice.
// joint point - when to be called
// Pointcut - matcher (what to be called)
//Aop provides modularity
