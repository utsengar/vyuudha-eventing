package com.eventing.driver;

import com.eventing.impl.IntegerAdderObImpl;
import com.eventing.impl.IntegerDataBagSubImpl;
import com.eventing.impl.IntegerPrinterObImpl;

public class Driver {
    public static void main( String [] args ) {
          Integer i1 = new Integer( 1 ); Integer i2 = new Integer( 2 );
          Integer i3 = new Integer( 3 ); Integer i4 = new Integer( 4 );
          Integer i5 = new Integer( 5 ); Integer i6 = new Integer( 6 );
          Integer i7 = new Integer( 7 ); Integer i8 = new Integer( 8 );
          Integer i9 = new Integer( 9 );
          
          IntegerDataBagSubImpl bag = new IntegerDataBagSubImpl();
          bag.add( i1 ); bag.add( i2 ); bag.add( i3 ); bag.add( i4 );
          bag.add( i5 ); bag.add( i6 ); bag.add( i7 ); bag.add( i8 );
          
          IntegerAdderObImpl adder = new IntegerAdderObImpl( bag );
          IntegerPrinterObImpl printer = new IntegerPrinterObImpl( bag );
          
          // adder and printer add themselves to the bag
          System.out.println( "About to add another integer to the bag:" );
          bag.add( i9 );
          System.out.println("");
          System.out.println("About to remove an integer from the bag:");
          bag.remove( 0 );
    }
}