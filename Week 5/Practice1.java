public class Practice1 {
    public static int add(int a, int b) {
        return a + b;
    }
   
    public static void mul(int a,int b) {
        System.out.println("The product is: " + (a * b));
    }
    public void greet(){
        System.out.println("hello world");
    }
    public static void main(String[] args) {
        int result = add(5, 3);
 
        System.out.println("The sum is: " + result);
        mul(5, 3);
        Practice1 greet=new Practice1();
        greet.greet();
       
    }
   
   
 
}
 