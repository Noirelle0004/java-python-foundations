import java.util.Scanner;
public class week2logincheck{
    public static void main(String[] arges){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username=scanner.nextLine();
        System.out.println("请输入密码：");
        String password=scanner.nextLine();
        if(username.equals("admin")&&password.equals("123456")){
            System.out.println("登录成功");
        }else{
            System.out.println("用户名或密码错误");
        }
        scanner.close();
    }
}