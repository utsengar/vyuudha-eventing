package com.eventing.interfaces;

public interface Subject {
    public void addObserver( Observer o );
    public void removeObserver( Observer o );
    public String getState();
    public void setState(String state);
}