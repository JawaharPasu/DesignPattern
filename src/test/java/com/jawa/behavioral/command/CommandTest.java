package com.jawa.behavioral.command;

import com.jawa.behavioral.command.Action;
import com.jawa.behavioral.command.BankAccount;
import com.jawa.behavioral.command.BankAccountCommand;
import com.jawa.behavioral.command.Command;
import org.junit.jupiter.api.Test;

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
