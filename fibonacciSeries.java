public class fibonacciSeries {
    public static void seriesGenerator(int n){
        int start=1,previousNum=0;
        for(int i=1;i<=n;i++){
            int tempVar=previousNum;
            previousNum=start;
            start=start+tempVar;
            System.err.println(start);
        }
    }
    public static void main(String arg[]){
        seriesGenerator(10);
    }
}
