import java.util.Scanner;
import java.util.Random;

public class CS211Lab1{
    public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("How many traitors are there going to be?\nRemember, the number can only be between 1 and 21.");
        int traitorNum = sc.nextInt();
        sc.close();
        System.out.println(gameShow(traitorNum));
    }
    public static double gameShow(int n){
        double traitorWins = 0;
        int participants = 22;
        int traitors = n;
        int faithful = participants - n;
        for(int i=0;i<100000;i++){
            faithful = participants - n;
            traitors = n;
            participants = 22;
            while(participants>2){
                faithful--;
                participants--;
                Random rand = new Random();
                int vote = rand.nextInt(participants);
                if(vote<traitors){
                    traitors--;
                    participants--;
                }
                else{
                    faithful--;
                    participants--;
                }

            }
            if(traitors>0){
                traitorWins++;
            }
        }
        double chance = (traitorWins/100000)*100;
        return chance;
    }
}