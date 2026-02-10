/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    public static String infixtopos(String infix){
        Stack<Character> stack=new Stack<>();
        StringBuilder str=new StringBuilder();
        char[] arr=infix.toCharArray();
        
        for(int i=0;i<infix.length();i++){
            if(arr[i]==' ') continue;
            if(Character.isLetterOrDigit(arr[i])){
                str.append(arr[i]);
            }else if(arr[i]=='('){
                stack.push(arr[i]);
            }else if(arr[i]==')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    str.append(stack.pop());
                }
                stack.pop();
            }
            else{
                while(!stack.isEmpty() && precedence(arr[i])<=precedence(stack.peek())){
                    str.append(stack.pop());
                }
                stack.push(arr[i]);
            }

        }
        while(!stack.isEmpty()){
            str.append(stack.pop());
        }
        return str.toString();
    }
    private static int precedence(char operator){
        switch(operator){
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;
            
                
        }
        return -1;
    }
    public static int eval(char[] ch){
        Stack<Integer> st=new Stack<>();
        for(char s:ch){
            if(s=='+' || s=='-' ||s=='*'||s=='/'){
                int b=st.pop();
                int a=st.pop();
                int result=0;
                if(s=='+'){
                    result=a+b;
                }else if(s=='-'){
                    result=a-b;
                }else if(s=='*'){
                    result=a*b;
                }
                else if(s=='/'){
                    result=a/b;
                }

                st.push(result);
            }
            else{

                st.push(s-'0');
            }
        }
        return st.pop();
    }

	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String res=infixtopos(str);
        // System.out.println(res);
        char[] ch=res.toCharArray();
        int result=eval(ch);
        System.out.println(result);
	}
}

