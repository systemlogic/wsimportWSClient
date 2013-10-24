package com.webservice.wsimportWSClient;

import com.systemlogic.Hello;
import com.systemlogic.HelloService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        HelloService hs = new HelloService();
        Hello hello = hs.getHelloPort();
        int a=22;
        int b=44;
        System.out.println("Sum of a + b = " + hello.sum(22, 44));
        System.out.println(hello.hi("Pranshi"));
    }
}
