package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable {
    Double balance;

    public BankAccount(){
        this.balance = 0.0;
    }


    public void setBalance(Double val) {
        this.balance = val;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) throws IllegalArgumentException {
        if (amountToIncreaseBy < 0) {
            throw new IllegalArgumentException();
        } else {
            this.balance = this.balance + amountToIncreaseBy;
        }
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) throws IllegalArgumentException {
        double newBalance = this.balance - amountToDecreaseBy;
        if (newBalance < 0.0 || amountToDecreaseBy < 0) {
            throw new IllegalArgumentException();
        } else {
            this.balance = this.balance - amountToDecreaseBy;
        }
    }

    @Override
    public Double getBalance() {
        return this.balance;
    }
}
