package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {

    private ArrayList<BankAccount> accountList;

    public Bank(){
        this.accountList = new ArrayList<>();
    }

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        if (this.accountList.get(indexNumber) != null) {
            BankAccount thisAccount = this.accountList.get(indexNumber);
            this.accountList.remove(this.accountList.get(indexNumber));
            return thisAccount;
        }
        return null;
    }

    public void addBankAccount(BankAccount bankAccount) {
        this.accountList.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        if (this.accountList.contains(bankAccount)){
            return true;
        }
        return false;

        //throw new UnsupportedOperationException("Method not yet implemented");
    }
}
