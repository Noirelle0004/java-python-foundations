import java.util.Scanner;
public class week2scorecheck{
    public static void main(String[] arges){
        Scanner scanner= new Scanner(System.in);
        System.out.println("请输入你的成绩：");
        if(scanner.hasNextInt()){
            int score=scanner.nextInt();
            if(score>=90){
                System.out.println("优秀");
            }else if(score>=80){
                System.out.println("良好");
            }else if(score>=60){
                System.out.println("及格");
            }else{
                System.out.println("不及格");
            }
        }else{
            System.out.println("请输入整数");
        }scanner.close();
    }
}