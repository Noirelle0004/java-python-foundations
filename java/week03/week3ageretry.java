import java.util.Scanner;
public class week3ageretry{
    public static void main(String[] arges){
        Scanner scanner=new Scanner(System.in);
        
        while(true){
            System.out.println("请输入年龄：");
            String input=scanner.nextLine();

            try{
                int age=Integer.parseInt(input);
                if(age>=18){
                    System.out.println("成年");
                }else{
                    System.out.println("未成年");
                }
                break;

            }catch(NumberFormatException e){
                System.out.println("请输入整数，请重新输入");
            }
 
            
        }
        scanner.close();
    }
}