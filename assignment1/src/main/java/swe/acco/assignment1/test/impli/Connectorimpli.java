package swe.acco.assignment1.test.impli;

import swe.acco.assignment1.test.interfaces.Connector;

public class Connectorimpli  implements Connector {

    public void add(int a, int b) {
        int c=a+b;
        System.out.println("addition of two numbers "+ c);
    }
    public void mul(int a, int b) {
        System.out.println("multiplication of two numbers"+ (a*b));
    }

    public void sub(int a, int b) {
        System.out.println("subtraction of two numbers"+ (a-b));
    }

    public void div(int a, int b) {
        if(b==0)
            System.out.println("division is not possible");
        else {
            double div=(double)a/b;
            System.out.println("division of two numbers" + div);
        }
    }
}
