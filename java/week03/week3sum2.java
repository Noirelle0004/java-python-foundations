public class week3sum2{
    public static void main(String[] arges){
        int total=0;
        for(int i=1;i<=100;i=i+1){
            if(i % 2 == 0){
                 total=total+i;

            }
        }
        System.out.println(total);
    }
}