package com.eventing.impl;

import java.util.Iterator;
import com.eventing.interfaces.Observer;
import com.eventing.interfaces.Subject;

public class IntegerPrinterObImpl implements Observer {
    private IntegerDataBagSubImpl bag;
    public IntegerPrinterObImpl( IntegerDataBagSubImpl bag ) {
          this.bag = bag;               
          bag.addObserver( this );
    }
    public void update( Subject o ) {
          if( o == bag ) {
                System.out.println( "The contents of the IntegerDataBag have changed." );
                System.out.println( "The new contents of the IntegerDataBag contains:" );
                Iterator<?> i = bag.iterator();
                while( i.hasNext() ) {
                      System.out.println( i.next() );
                }
          }
    }
}