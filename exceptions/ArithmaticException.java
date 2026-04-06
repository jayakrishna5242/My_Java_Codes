package com.exceptions;

class JayaException extends Exception {
    public JayaException(String msg) {
        super(msg);
    }
}

public class ArithmaticException {

   void main() throws JayaException {
        int a = 10, b = 0;
       
        
        int age =1;
        if(age<=18) {
        	throw new JayaException("You Are Not Eligible bewakoof");
        }
    }
}
