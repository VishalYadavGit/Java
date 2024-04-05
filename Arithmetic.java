public class Arithmetic {
    public static void main(String args[]){
    //TYPES OF OPERATORS:
     // 1) Arithmetic Operator
     // 1) Relational Operator
     // 1) Logical Operator
     // 1) Arithmetic Operator

        //There are two types of Arithmetic Operator: 1) Binary Operator 2) Unary Operator
        // Binary Operator--> (+, -, *, /, %)


        // Unary Operator--> (++, --) This can be user like a++ or ++a for example
        
        int a=10;
        int b=0;

        b=a++; // Here b will become 10 and a will become 11
        b=++a; // Here b will become 11 as well as a

        System.out.println(a);
        System.out.println(b);


        // Relations Operator ---> (>,<,>=,<=,==,!,!=,!<,!>) Used to comparison

        // Logical Operator ---> (&&,||,!) Used to establish combination between two or more statement

        // Bitwise Operator ---> (&,|,^,~,<<,>>) Used to establish combination between bits.
          // ^ is for XOR and ~ is for compliment 
          // >> Binary right or left shift is used to shift the postition of bits 
        if(true & true){
            System.err.println("True");
        }

        // Asignment Operator ---> (=,+=,-=,*=,etc) Used with '='
    }
}
