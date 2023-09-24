
//calculator program

import java.util.*;
class Calculator{
    public static void main(String[] args)
    {
    while(true){
        double num1,num2,result;
	    char operator;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num1");
        num1=sc.nextDouble();
        System.out.println("Enter the num2");
        num2=sc.nextDouble();
        System.out.println("Enter + for the addition: ");
        System.out.println("Enter - for the subtraction: ");
        System.out.println("Enter * for the multiplication: ");
        System.out.println("Enter / for the Division: ");
        operator = sc.next().charAt(0);
        switch(operator){
        case '+' : result=num1+num2;
                   System.out.println("sum is "+result);
                   break;
        case '-' : result=num1-num2;
                   System.out.println("difference is "+result);
                   break;
        case '*' : result=num1*num2;
                   System.out.println("multiplication is "+result);
                   break;
        case '/' : if(num1!=0){
                    result=num1/num2;
                    System.out.println("division is "+result);
                    }
                    else{
                        System.out.println("Invalid number");
                    }
                   break;
        default : System.out.println("Invalid Operator");
        sc.close();
       }
    }
}
}