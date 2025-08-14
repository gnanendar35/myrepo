import java.util.Scanner;

public class neon {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int square=n*n;
        int sum=0;
        while(square!=0){
            sum+=square%10;
            square/=10;
        }
        if(sum==n){
        System.out.println("the number is neon:");}
        else{
            System.out.println("the number is not neon:");
        }

    }
}
