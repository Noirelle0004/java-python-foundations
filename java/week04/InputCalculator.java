import java.util.Scanner;
public class InputCalculator{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your first number:");
        double a=scanner.nextDouble();

        System.out.println("Enter your second number:");
        double b=scanner.nextDouble();

        double addResult=add(a,b);
        double subtractResult=subtract(a,b);
        double multiplyResult=multiply(a,b);

        System.out.print("add="+addResult+";subtract="+subtractResult+";multiply="+multiplyResult);

        if(b==0){
            System.out.println(";divide=cannot divide by zero");
        }else{
            double divideResult=divide(a,b);
            System.out.println(";divide="+divideResult);
        }
    }
    public static double add(double a,double b){
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