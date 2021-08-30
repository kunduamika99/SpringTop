package work.day2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component("acc")
public class Account implements ApplicationContextAware {

    @Autowired
    private ApplicationContext appCtx;

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public Account() {
        this.balance = 0.0;
    }

    public double deposit(double amount) throws AmountException{
        TestAccount test = (TestAccount) appCtx.getBean("testing");
        try {
            if(!test.testInvalidDeposit(amount)) {
                if(test.testValidDeposit(amount)){
                    double Nbalance  = getBalance()+ amount;
                    this.balance = Nbalance;
                    System.out.println("Amount deposited \nBalance = $"+balance);
                }
            }
            return getBalance();
        }catch (AmountException e){
            throw e;
        }
    }

    public double withdraw(double amount) throws AmountException, BalanceException{
        TestAccount test = (TestAccount) appCtx.getBean("testing");
        try {
            if (!test.testValidWithdraw(amount)){
                throw new AmountException("Not valid ");
            }

            test.testInsufficientWithdraw(amount,this.balance);
            test.testInvalidWithdraw(amount);

            double Nbalance = getBalance() - amount;
            this.balance = Nbalance;
            System.out.println("Amount withdrawn $" + amount + "\nBalance = $" +balance);
            return getBalance();
        }catch (AmountException a){
            throw a;
        }catch (BalanceException b){
            throw b;
        }
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.appCtx = applicationContext;
    }
}
