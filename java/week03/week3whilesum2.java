public class week3whilesum2{
    public static void main(String[] arges){
        int total=0;
        int  i=1;
        while(i<=100){
            if(i%2==0){
                total=total+i;
            }
            i=i+1;

        }
        System.out.println(total);
    }
}