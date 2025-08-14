import java.util.Scanner;
public class Roman {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a roman number:");
        String roman =sc.nextLine();
        int value=0;
        int num=0;
        for(int i=roman.length()-1;i>=0;i--){

            switch(roman.charAt(i)){
                case 'I':
                    value=1;

                    break;
                case 'V':
                    value=5;
                    break;
                case 'X' :
                    value=10;
                    break;
                case 'L' :
                    value=50;
                    break;
                case 'C' :
                    value=100;
                    break;
                case 'D':
                    value=500;
                    break;
                case 'M':
                    value=1000;
                    break;
                default:System.out.println("invalid roman number:");
            }
            if(value*4<num){
                num-=value;
            }
            else{
                num+=value;
            }
        }
        System.out.println("integer value:"+num);
    }

}


