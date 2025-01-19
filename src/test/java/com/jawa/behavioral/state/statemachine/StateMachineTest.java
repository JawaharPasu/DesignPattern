package com.jawa.behavioral.state.statemachine;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StateMachineTest {

    @Test
    public void test() throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            System.out.println(" the phone is currently in " + Demo.currentState);
            System.out.println("select a trigger ");
            for (int i=0; i<Demo.rules.get(Demo.currentState).size(); ++i) {
                Trigger trigger = Demo.rules.get(Demo.currentState).get(i).getKey();
                System.out.println("" + i + " ' " + trigger);
            }

            boolean parseOk;
            int choice=0;
            do {
                try {
                    System.out.println("Enter your choice: ");

                    //choice = Integer.parseInt(console.readLine());
                    choice = 1;
                    parseOk = choice >= 0 && choice < Demo.rules.get(Demo.currentState).size();
                } catch (Exception ex) {
                    parseOk = false;
                }
            } while (!parseOk);

            Demo.currentState = Demo.rules.get(Demo.currentState).get(choice).getValue();

            if (Demo.currentState == Demo.exitState) break;
        }
    }
}
