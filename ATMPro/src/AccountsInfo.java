package ATMPro;

import java.text.*;
import java.util.Scanner;

public class AccountsInfo {
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    // Setting the customer numbers

    public int setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber; // doubt ??
        return customerNumber;
    }

    public int setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
        return pinNumber; // doubt ??
    }

    // get checking account balance
    public double getCheckingBalance() {
        return checkingBalance;
    }

    // get savings account balance
    public double getSavingBalance() {
        return savingBalance;
    }

    // claculate saving account withdrawl
    public double calcSavingWithdraw(double amount) {
        savingBalance = savingBalance - amount;
        return savingBalance;
    }

    // calculate checking account balance
    public double clacCheckingBalance(double amount) {
        checkingBalance = checkingBalance - amount;
        return checkingBalance;
    }

    // claculate checking account deposite
    public double clacCheckingDeposit(double amount) {
        checkingBalance = checkingBalance + amount;
        return checkingBalance;
    }

    // calculate saving account deposite
    public double calcSavingDeposit(double amount) {
        savingBalance = savingBalance + amount;
        return savingBalance;
    }

}
