public class array2d {
    public static void main(String args[]){
        int[][] newArr = new int[3][3]; // One way to declare an array
        // int newArr[][] = new int[3][3]; Another way to declare an array
        // int[][] newArr = {{1,2,3},{1,2,3}}; Another method to declare an array if you know the values beforehand
        
        newArr[0][0] = 23;
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(newArr[i][j]);
            }
        } 

    }
}
