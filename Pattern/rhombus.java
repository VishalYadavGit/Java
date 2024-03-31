import java.util.*;
public class rhombus {
    public static void main(String[] args){
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("What's a ? ");
        a=sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=0;j<=a-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=a;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
