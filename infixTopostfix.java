import java.io.*;
import java.util.*;
public class infixTopostfix
{
    public static int Precedence(char ch)
    {
        if(ch == '^')
            return 3;
        else if(ch == '*' || ch == '/')
            return 2;
        else if(ch == '+' || ch == '-')
            return 1;
        else 
            return 0;
    }
    public static String infixToPostfix(String str)
    {
        Deque<Character> stack = new ArrayDeque<Character>();
        String result = new String("");
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(Character.isAlphabetic(ch))
            {
                result = result + ch;
            }
            else if(ch == '(')
            {
                stack.push('(');
            }
            else if(ch == ')')
            {
                while(!stack.isEmpty() && stack.peek() != '(')
                {
                    result = result + stack.peek();
                    stack.pop();
                }
                stack.pop();
            }
            else 
            {
                while(!stack.isEmpty() && Precedence(ch) <= Precedence(stack.peek()))
                {
                    result = result + stack.peek();
                    stack.pop();
                }
                stack.push(ch);
            }
        }
 
        while(!stack.isEmpty())
        {
            result = result + stack.peek();
            stack.pop();
        }
        return result;
    }
 
    public static void main(String[] args) 
    {
        String s = "3*(4+5)";
        System.out.println(infixToPostfix(s));
    }
}