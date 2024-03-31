import java.util.Scanner;
public class firstFunction {
    public static int addNumber(int a, int b){
        return a+b;
    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("What's a? ");
        int a = scan.nextInt();
        System.out.println("What's b? ");
        int b = scan.nextInt();
        scan.close();
        int c=addNumber(a,b);
        System.out.println("The sum of "+a+" + "+b+" is "+c);
    }
}
