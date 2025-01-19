package com.jawa.behavioral.state.statemachine;

public enum State {
    OFF_HOOK, // starting state
    ON_HOOK, // terminal state
    CONNECTING,
    CONNECTED,
    ON_HOLD
}
