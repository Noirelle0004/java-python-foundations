public class methodintro{
    public static void main(String[] args){
        int result=add(3,5);
        int result1=add(10,20);
        int result2=add(100,200);
        System.out.println("result="+result+";result1="+result1+";result2="+result2);
    }
    public static int add(int a,int b){
        int sum=a+b;
        return sum;
    }
}