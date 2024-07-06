import java.util.Scanner;

public class Guess_The_Number {
    public static void main(String[] args){
        //  MY MINI PROJECT
        Scanner sc = new Scanner(System.in);
        int myNumber =(int) (Math.random()*100);
        int userNumber =0;
        do{
            System.out.println("Guess The Number : ");
            userNumber = sc.nextInt();

            if(userNumber ==myNumber){
                System.out.println("WOW...CORRECT NUMBER !!!");
                break;
            }

            else if(userNumber > myNumber){
                System.out.println("Your Number is too Large");
            }

            else{
                System.out.println("Your Number is too Small");
            }
        } while(userNumber >= 0);
        
        System.out.println("My Number was  :");
        System.out.println(myNumber);
    }
    
}
