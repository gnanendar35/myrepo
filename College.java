import java.util.Scanner;
public class College {
    public static void main(String []args){
        StudentDetails student=new StudentDetails();
        Scanner sc=new  Scanner(System.in);
        while(true){
            System.out.println("WELCOME TO AU\n");
            System.out.println("1.Set Student details\n2.Get student details");
            System.out.print("Enter you Query:");
            int choice=sc.nextInt();
            switch (choice){
                case 1:student.SeDetails();
                break;
                case 2:student.geDetails();
                break;
                default:System.exit(0);
            }
        }
    }
}