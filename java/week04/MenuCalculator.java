import java.util.Scanner;
public class MenuCalculator{
    public static void main(String[] args){
     Scanner scanner=new Scanner(System.in);
     System.out.println("1.add 2.subtract 3.multiply 4.divide");
     System.out.println("Enter your choice:");
     int choice=scanner.nextInt();
     System.out.println("Enter first number:");
     double a=scanner.nextDouble();
     System.out.println("Enter second number:");
     double b=scanner.nextDouble();
     if(choice==1){
        double result=add(a,b);
        System.out.println("result="+result);
     }else if(choice==2){
        double result=subtract(a,b);
        System.out.println("result="+result);
     }else if(choice==3){
        double result=multiply(a,b);
        System.out.println("result="+result);
     }else if(choice==4){
        if(b==0){
            System.out.println("divide=cannot divide by zero");
        }else{
            double result=divide(a,b);
            System.out.println("result="+result);
        }
     }else{
        System.out.println("Invalid choice");
     }
    }public static double add(double a,double b){
        return a+b;
    }
    public static double subtract(double a ,double b){
        return a-b;
    }
    public static double multiply(double a,double b){
        return a*b;
    }
    public static double divide(double a,double b){
        return a/b;
    }
}