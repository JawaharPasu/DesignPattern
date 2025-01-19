package com.jawa.behavioral.momento;

import com.jawa.behavioral.momento.BankAccount;
import com.jawa.behavioral.momento.Momento;
import org.junit.jupiter.api.Test;

public class MomentoTest {

    @Test
    public void test() {
        BankAccount account = new BankAccount(100);
        Momento m1 = account.deposit(50);
        Momento m2 = account.deposit(25);

        System.out.println(account);

        //restore to m1

        account.restore(m1);
        System.out.println(account);

        account.restore(m2);
        System.out.println(account);
    }
}
