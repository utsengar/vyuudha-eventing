package com.eventing.impl;

import java.util.ArrayList;
import java.util.Iterator;

import com.eventing.interfaces.Observer;
import com.eventing.interfaces.Subject;

public class IntegerDataBagSubImpl implements Subject {
      private ArrayList<Integer> list = new ArrayList<Integer>();
      private ArrayList<Observer> observers = new ArrayList<Observer>();
      private String state = "";
      
      public void add( Integer i ) {
            list.add( i );
            notifyObservers();
      }
      public Iterator<Integer> iterator() {
            return list.iterator();
      }
      public Integer remove( int index ) {
            if( index < list.size() ) {
                  Integer i = (Integer) list.remove( index );
                  notifyObservers();
                  return i;
            }
            return null;
      }
      public void addObserver( Observer o ) {
            observers.add( o );
      }
      public void removeObserver( Observer o ) {
            observers.remove( o );
      }
      private void notifyObservers() {
            // loop through and notify each observer
            Iterator<Observer> i = observers.iterator();
            while( i.hasNext() ) {
                  Observer o = ( Observer ) i.next();
                  o.update( this );
            }
      }
	@Override
	public String getState() {
		return state;
	}
	@Override
	public void setState(String state) {
		this.state = state;
	}
}


