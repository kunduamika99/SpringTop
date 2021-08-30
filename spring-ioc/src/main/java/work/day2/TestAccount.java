package work.day2;

import org.springframework.stereotype.Component;

@Component("testing")
public class TestAccount extends Account{
    public boolean testValidDeposit(double amount){
        if(amount > 0) return true;
        return false;
    }

    public boolean testInvalidDeposit(double amount) throws AmountException{
        if(amount < 0 ) throw new AmountException("Invalid amount");
        return false;
    }

    public boolean testValidWithdraw(double amount){
        if( amount > 0) return true;
        return false;
    }

    public boolean testInvalidWithdraw(double amount) throws AmountException{
        if(amount < 0) throw new AmountException("Invalid amount");
        return false;
    }

    public boolean testInsufficientWithdraw(double amount, double balance) throws BalanceException{
        if(balance < amount) throw new BalanceException("Inadequate balance");
        return false;

    }

}
