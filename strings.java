public class strings {
    public static void main(String args[]){
        
        
        // Stings are immutable in JAVA.


        String hey = "Hello bro"; //ways of declaring a string.
        System.out.println(hey);
        System.out.println(hey.length()); // print length of the string 

        for(int i=0;i<hey.length();i++){
            System.err.println(hey.charAt(i)); // print character on specific index
        }

        //comparing two strings
        String name="Grey";
        String name2= "Gorgia";
        System.out.println(name.compareTo(name2)); //give an integer which deterimines alphabetically if the smaller, larger or equal to the other string.


        //Spliting strings in java similar to python split where we provide starting and ending index of the new string in the parent string
        String onlyHello = hey.substring(0, 5);
        System.out.println(onlyHello);
    
    }
}
