import java.util.Scanner;

public class FirstClass {
    public static void main(String[] args){
        int a;
        System.out.print("Enter a : ");
        Scanner scan= new Scanner(System.in);
        a=scan.nextInt();
        scan.close();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<=2*(a-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a-i;j++){
                System.out.print("*");
            }
            for(int j=0;j<=2*i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=a-i;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        

    }
}
