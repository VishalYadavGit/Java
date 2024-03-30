import java.util.*;

class FirstClass{
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
            for(int k=0;k<=2*(a-i);k++){
                System.out.print(" ");
            }
            for(int l=1;l<=i;l++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a-i;j++){
                System.out.print("*");
            }
            for(int k=0;k<=2*i;k++){
                System.out.print(" ");
            }
            for(int l=1;l<=a-i;l++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        

    }}
