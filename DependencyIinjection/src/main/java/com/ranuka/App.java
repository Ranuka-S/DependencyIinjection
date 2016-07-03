package com.ranuka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ranuka.model.Account;
import com.ranuka.model.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	
        Customer cus1 =context.getBean("Customer",Customer.class);
        cus1.setCustomerAddress("38 kantiki");
        cus1.setCustomerFName("first name");
        cus1.setCustomerLName("last name");
        cus1.setCustomerID(1);
        cus1.getMyaccounts().setAccountID(1);
        cus1.getMyaccounts().setAccountBalance(100);
        cus1.getMyaccounts().setAccountType("savings");
        System.out.println(cus1.getMyaccounts().depositAccount(100)); 
        
        
    }
}
