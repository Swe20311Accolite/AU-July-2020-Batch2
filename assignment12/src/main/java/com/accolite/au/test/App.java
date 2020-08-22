package com.accolite.au.test;

import swe.acco.assignment1.test.impli.Connectorimpli;
import swe.acco.assignment1.test.interfaces.Connector;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a =sc.nextInt();
        int b =sc.nextInt();
        Connector obj =new Connectorimpli();
        obj.add(a,b);
        obj.mul(a,b);
        obj.sub(a,b);
        obj.div(a,b);
    }
}
