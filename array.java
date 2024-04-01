public class array {
    public static void main(String[] args) {
        int[] newArr = new int[10];
        // int newArr[] = new int[10] This is also a valid syntax.
        // int[] newArr = {1,2,3,4,5,6,7,8}; Another method for defining array.
        // int newArr[] = {1,2,3,4,5,6,7,8}; This is also a method to make predefined array.
        newArr[0]=12;
        for(int i=0;i<10;i++){
            System.err.println(newArr[i]);
        }
    }
}
