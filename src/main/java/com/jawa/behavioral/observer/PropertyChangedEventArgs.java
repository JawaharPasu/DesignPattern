package com.jawa.behavioral.observer;

public class PropertyChangedEventArgs {
    public Object object;
    public String propertyName;

    public PropertyChangedEventArgs(Object object, String propertyName) {
        this.object = object;
        this.propertyName = propertyName;
    }
}
