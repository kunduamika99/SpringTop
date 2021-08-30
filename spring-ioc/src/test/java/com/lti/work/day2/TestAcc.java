package com.lti.work.day2;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import work.day2.Account;
import work.day2.AmountException;
import work.day2.BalanceException;

public class TestAcc {

    @Test
    public void test(){
        ApplicationContext appCtx = new ClassPathXmlApplicationContext("workDay2.xml");
        Account account = appCtx.getBean("acc",Account.class);
        double balance;
        try {
            balance = account.deposit(30000.0);
//            balance = account.deposit(-30000.0);
            System.out.println("Bank: Current Balance : $" + balance);
            balance = account.withdraw(2000.0);
//            balance = account.withdraw(-2000.0);
//            balance = account.withdraw(200000.0);
            System.out.println("Bank: Current Balance : $" + balance);
        } catch (AmountException e) {
            System.out.println(e);
        } catch (BalanceException e) {
            System.out.println(e);
        }
    }
}
