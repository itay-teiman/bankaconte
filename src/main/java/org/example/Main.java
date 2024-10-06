package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        SavingAccount serve1 = new SavingAccount();
        SavingAccount serve2 = new SavingAccount();

        serve1.setSavingBalance(5000);
        serve2.setSavingBalance(6000);

        System.out.println(serve1.getSavingBalance());
        System.out.println(serve2.getSavingBalance());
        // קביעת הריבית השנתית
        serve1.ModifyInterestRate(0.1);
        serve2.ModifyInterestRate(0.1);

        // חישוב הריבית החודשית
        System.out.println(serve1.CalculateMounthlyInterest());
        System.out.println(serve2.CalculateMounthlyInterest());



    }
}