import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;
// import java.util.stream.IntStream;
public class CS211Lab9{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // BigInteger n = new BigInteger(sc.nextLine());
        // HashMap<Integer, BigInteger> map = new HashMap<Integer, BigInteger>();
        // for(int i=1;i<=n;i++){
        //     map.put(i,BigInteger.valueOf(collatz(n)));
        // }
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=1;i<=n;i++){
            map.put(i,collatz(n));
        }
        System.out.println(map);

        // System.out.println(collatzSort(n,0,n-1));
    }
    // public static int collatzSort(int n,int lowBound,int highBound){
    //     int [] arr = IntStream.range(1, n+1).toArray();
    //     int pivot = arr[highBound];
    //     int lp = lowBound;
    //     int rp = highBound-1;
    //     while(lp!=rp){
    //         if(collatz(arr[lp])<collatz(arr[rp])){
    //             lp++;
    //         }
    //         else{

    //         }
    //     }
    //     return 1;
    // }
    public static int collatz(int b){
        int steps = 0;
        int a = b;
        while(a!=1){
            if(a%2==0){
                a = a/2;
                steps++;
            }
            else{
                a = a*3 +1;
                steps++;
            }
        }
        return steps;
    }
}