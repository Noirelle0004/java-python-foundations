public class Calculator{
    public static void main(String[] args){
        int a=20;
        int b=5;
        int addResult=add(a,b);
        int subtractResult=subtract(a,b);
        int multiplyResult=multiply(a,b);
        double divideResult=divide(a,b);

        System.out.println("add="+addResult+";subtract="+subtractResult+";multiply="+multiplyResult+";divide="+divideResult);
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static int subtract(int a ,int b){
        return a-b;
    }
    public static int multiply(int a,int b){
        return a*b;
    }
    public static double divide(int a,int b){
        return (double) a/b;
    }
}