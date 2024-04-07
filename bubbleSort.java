public class bubbleSort {
    public static void main(String args[]){
        //Bubble sort
        int arr[]={7,8,3,2,1};

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++)
            if(arr[j]>arr[j+1]){
                int x=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=x;
            }
        }
        //Printing new arr
        for(int i=0;i<arr.length;i++){
            System.err.print(arr[i]+"");
        }
    }
}
