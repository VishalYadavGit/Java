import java.util.*;
public class Pyramid {
    public static void main(String[] args){
        int a;
        Scanner scan=new Scanner(System.in);
        System.out.println("What's a?");
        a=scan.nextInt();
        for(int i=1;i<=a;i++){
            for (int j=1;j<=a-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }
        scan.close();

    }
}
