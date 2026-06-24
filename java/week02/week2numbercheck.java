import java.util.Scanner;
public class week2numbercheck{
    public static void main(String[] arges){
        Scanner scanner= new Scanner(System.in);
        System.out.println("请输入一个整数：");
        if (scanner.hasNextInt()){
            int number=scanner.nextInt();
            if(number>0){
                System.out.println("正数");
            }else if(number<0){
                System.out.println("负数");
            }else{
                System.out.println("0");
            }
        }else{
            System.out.println("请输入整数");
        }
        scanner.close();
    }
}