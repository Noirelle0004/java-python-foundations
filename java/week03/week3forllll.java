public class week3forllll{
    public static void main(String[] arges){
        int[] scores={88,59,76,92,45,100,67};
        int total=0;
        int passcount=0;
        int failcount=0;
        int max=scores[0];
        int min=scores[0];
        for(int score:scores){
            total=total+score;
            if(score>=60){
                passcount=passcount+1;
            }else{
                failcount=failcount+1;
            }
            if(score>max){
                max=score;
            }
            if(score<min){
                min=score;
            }
        }
        double average=(double) total/scores.length;

        System.out.println("total="+total);
        System.out.println("average="+average);
        System.out.println("pass="+passcount);
        System.out.println("fail="+failcount);
        System.out.println("max="+max);
        System.out.println("min="+min);

    }
}