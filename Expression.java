package com.company;
import java.util.Scanner;
import java.util.Stack;
public class Expression {

    public static int calculator(char[] ch,int n) throws Exception {

        Stack<Integer> operands=new Stack<Integer>();
        Stack<Character> operators=new Stack<Character>();
        for(int i=0;i<n;i++)
        {
            if((ch[i] >='0') && (ch[i] <='9'))
            {
                StringBuffer sb=new StringBuffer();
                while(i<n && ch[i]>='0'&& ch[i]<='9')
                    sb.append(ch[i++]);
                String s1=sb.toString();
                operands.push(Integer.parseInt(s1));
            }
            if(ch[i]=='(')
            {
                operators.push(ch[i]);
            }
            if(ch[i]==')')
            {
                while(operators.peek()!='(') {
                    int temp = operands.pop();
                    int temp1 = operands.pop();
                    char op = operators.pop();
                    operands.push(evaluation(temp, temp1, op));
                }
                    operators.pop();
            }
            if(ch[i]=='+' || ch[i]=='-' || ch[i]=='*' || ch[i]=='/' || ch[i]=='%')
            {
                while(!operators.empty() && OpPrecedence(ch[i],operators.peek())) {
                    int temp=operands.pop();
                    int temp1=operands.pop();
                    char op=operators.pop();
                    operands.push(evaluation(temp,temp1,op));
                }
                operators.push(ch[i]);
            }
        }
        while(!operators.empty()) {
            int temp=operands.pop();
            int temp1=operands.pop();
            char op=operators.pop();
            operands.push(evaluation(temp,temp1,op));
        }
        //System.out.println(operands.pop());
        return operands.pop();
    }
    public static boolean OpPrecedence(char op1,char op2)
    {
        if(op2=='(' || op2 == ')')
            return false;
        if((op1=='*' || op1=='/') && (op2=='+' || op2=='-'))
            return false;
        else
            return true;
    }
    public static int evaluation(int b,int a,char operator) throws Exception {
        if (operator == '+') {
            return a + b;
        } else if (operator == '-') {
            return a - b;
        } else if (operator == '*') {
            return a * b;
        } else if (operator == '/') {
            if (b == 0)
                throw new Exception("operation cannot be done");
            return a / b;
        } else if (operator == '%') {
            if (b == 0)
                throw new Exception("operation cannot be done");
            return a % b;
        }
        throw new Exception("other operations cannot be done");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        char[] ch=s.toCharArray();
        int n=ch.length;
        int result=calculator(ch,n);
        System.out.println(result);
    }
}
