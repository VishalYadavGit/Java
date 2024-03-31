public class GCFfunction {
    public static int GCF(int a,int b){
        int commonFactor=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                if(b%i==0){
                    if(i>commonFactor){
                            commonFactor=i;
                        }
                    }
            }
        }
        return commonFactor;
    }
    public static void main(String arg[]){
        int a=GCF(50,75);
        System.out.println(a);
    }
}
