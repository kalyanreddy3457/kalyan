import java.util.*;
class Calculator
{
void addition(float a,float b){
System.out.println("Answer= "+(int)(a+b));}
void subtraction(float a,float b){
System.out.println("Answer= "+(int)(a-b));}
void multiplication(float a,float b){
System.out.println("Answer= "+(int)(a*b));}
void division(float a,float b){
System.out.println("Answer= "+(a/b));}
}


public class Math
{
public static void main(String k[])
{
float a,b;
Scanner in=new Scanner(System.in);
System.out.println("Enter the Symbol for calculation\naddition(+)\nsubraction(-)\nmultiplication(*)\ndivision(/)");
char s;
s=in.next().charAt(0);
System.out.println("enter the inputs:");
a=in.nextFloat();
b=in.nextFloat();
Calculator w=new Calculator();
if(s=='+')
w.addition(a,b);
else if(s=='-')
w.subtraction(a,b);
else if(s=='*')
w.multiplication(a,b);
else if(s=='/')
w.division(a,b);
else 
System.out.println("enter the correct Symbol");
}
}