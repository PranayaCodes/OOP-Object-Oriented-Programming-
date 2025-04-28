import java.util.Scanner;
public class Multplication {
    public static void main(String[] args) {
        Scanner b=new Scanner(System.in);
        System.out.print("Enter the number");
        int a=b.nextInt();
        System.out.print("Multiplication Table of "+a);
        for(int i =1;i<=10;i++){
            System.out.println(a+"*"+i+"="+(a*i));
        }

    }

    
}
