package com.jawa.behavioral.state.statemachine;


import org.apache.commons.lang3.tuple.MutablePair;
import org.apache.commons.lang3.tuple.Pair;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {
    public static Map<State, List<Pair<Trigger, State>>> rules = new HashMap<>();

    static {
        rules.put(State.OFF_HOOK, List.of(
                new MutablePair<>(Trigger.CALL_DIALED, State.CONNECTING),
                new MutablePair<>(Trigger.STOP_USING_PHONE, State.ON_HOOK)
        ));
        rules.put(State.CONNECTING, List.of(
                new MutablePair<>(Trigger.HUNG_UP, State.OFF_HOOK),
                new MutablePair<>(Trigger.CALL_CONNECTED, State.CONNECTED)
        ));
        rules.put(State.CONNECTED, List.of(
                new MutablePair<>(Trigger.LEFT_MESSAGE, State.OFF_HOOK),
                new MutablePair<>(Trigger.HUNG_UP, State.OFF_HOOK),
                new MutablePair<>(Trigger.PLACED_ON_HOLD, State.ON_HOLD)
        ));
        rules.put(State.ON_HOLD, List.of(
                new MutablePair<>(Trigger.TAKEN_OFF_HOLD, State.CONNECTED),
                new MutablePair<>(Trigger.HUNG_UP, State.ON_HOOK)
        ));
    }

    public static State currentState = State.OFF_HOOK;
    public static State exitState = State.ON_HOOK;
}
