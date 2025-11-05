import java.util.Scanner;
public class CS211Lab2{
    public static void main( String [] args){
        Scanner sc = new Scanner(System.in);
        student(sc.nextLine());
        System.out.println(loanRepayment(sc.nextInt(),sc.nextInt(),sc.nextDouble())+" Months");
    }
    public static int loanRepayment(double loan,double repayment, double interest){
        double PeriodicRate = (interest/12)/100;
        if(loan<=0){
            return 0;
        }
        return 1+loanRepayment((loan*(1+PeriodicRate)-repayment),repayment,interest);
    }
    public static void student(String a){
        if(a.matches(".*A.*A.*") || a.matches(".*LLL.*")){
            System.out.println("Student has failed");
        }
        else{
            System.out.println("Student has passed");
        }
    }

}