import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        sc.close();
        int i=1;
        do { 
            System.out.println(num+"x"+i+"="+num*i);
            i++;
            
        } while (i<=10);

    }
}
