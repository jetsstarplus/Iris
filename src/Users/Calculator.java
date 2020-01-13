/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import java.util.Stack;

/**
 *
 * @author User
 */
public class Calculator {
    
    public Calculator() {
        String exp = "20+3-7";
        
        System.out.println(infixToPostfix(exp));
        System.out.println(evaluatePostfix("223+7+"));
    }
    //A utility function that returns the precedence of a particular operator
    //Higher value means higher precedence
    
    public static int prec(char c)
    {
        switch(c)
        {
            case '^':
                return 1;
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 3;
        }
        
        return -1;
    }
    
    
    /** The main method that converts from infix to postfix forma
     * @param exp
     * @return 
     * */
    public static String infixToPostfix(String exp)
    {
        String result = "";
        
        //initialising the stack;
        Stack<Character> stack = new Stack();
        
        for(int i = 0; i<exp.length(); i++)
        {
            char c = exp.charAt(i);
            
            //check if the scanned character is an operand and then add it to the output
            if(Character.isLetterOrDigit(c))
            {
                result += c;
            }
            
            
            //checking if in the characters there are ( and ) operators
            else if(c=='(')
            {
                stack.push(c);
            }
            
            else if(c == ')')
            {
                while(!stack.isEmpty() && stack.peek() !='(')
                {
                    result += stack.pop();
                }
                
                if(!stack.isEmpty() && stack.peek() != '(')
                {
                    return ("invalid operation");
                }
                
                else
                {
                    stack.pop();
                }
            }
            
            else  // if an operand is encountered by the system
            {
                while(!stack.isEmpty() && prec(c) <= prec(stack.peek()) )
                {
                    if(stack.peek() == '(')
                    
                        return "Invalid Operation";
                    
                    result += stack.pop();
                    }
                stack.push(c);
                }
        }
            
            while(!stack.isEmpty())
            {
                if(stack.peek() == '(')
                    return "Invalid Operation";
            result += stack.pop();
            }
        return result;
        }
    
    
    /** Evaluating the postfix operation that has been gaine
     * @param exp
     * @return */
    public static int evaluatePostfix(String exp)
    {
        //creating the stack
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<exp.length(); i++)
        {
            char c = exp.charAt(i);
            
            //checking if the character is a digit
            if(Character.isDigit(c)){
                stack.push(c - '0');
                
            }
            
            else
            {
                int val1 = stack.pop();
                int val2 = stack.pop();
                
                switch(c)
                {
                    case '+':
                        stack.push(val2 + val1);
                        break;
                    case '*':
                        stack.push(val2 * val1);
                        break;
                    case '/':
                        stack.push(val2 / val1);
                        break;
                    case '-':
                        stack.push(val2 - val1);
                        break;
                }
            }
        }
        return stack.pop();
    }
    
    public static void main(String args[])
    {
        Calculator cal = new Calculator();
    }

}
