package com.jawa.structural.command;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

public class CommandTest {
    @Test
    void test(){
        BankAccount ba = new BankAccount();
        List<BankAccountCommand> commands = List.of(
          new BankAccountCommand(ba, Action.DEPOSIT, 100),
          new BankAccountCommand(ba, Action.WITHDRAW, 1000)
        );

        for (Command command: commands) {
            command.call();
        }

        for (Command command: commands) {
            command.undo();
        }
    }
}
