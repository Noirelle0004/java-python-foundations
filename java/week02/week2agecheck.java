import java.util.Scanner;
public class week2agecheck{
    public static void main(String[] arges){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入您的年龄：");
        if(scanner.hasNextInt()){
            int age=scanner.nextInt();
            if(age>=18){
                System.out.println("成年");
        
            }else{
                System.out.println("未成年");}
            

        }else{
            System.out.println("请输入整数");}
        
        scanner.close();
    }
}