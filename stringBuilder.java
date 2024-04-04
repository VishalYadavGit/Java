import java.util.*;
public class stringBuilder {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        // Declaring a StringBuilder
        // StringBuilder is used to build strings differently from the normal String datatype the string datatype creates a new memory for every character change and points toward it after deleting the older one so it might become ineffecient and slow in a long run so we use StringBuilder class and its methods to update the memory at the same place.
        StringBuilder sb = new StringBuilder(sc.nextLine());

        System.out.println(sb.indexOf("V")); //One of the methods of stringbuilder used to find index of specific str.

        System.out.println(sb.charAt(0)); // Print char on the index

        sb.setCharAt(0, 'P'); // replace char at specfic index with another char
        System.out.println(sb);

        sb.insert(0, 'O'); // It is used to insert any character at a specific index
        System.out.println(sb);

        sb.delete(0, 2); // It removes the part from starting index to last index
        System.out.println(sb);

        sb.append('i'); // It adds a character to the end of the string
        System.out.println(sb);

        System.out.println(sb.length()); // Used to print the length of Sb string

        sc.close();

    }
}
