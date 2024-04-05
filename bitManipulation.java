public class bitManipulation {
    public static void main(String args[]){

        //GET BIT (We use 'bitwise AND' to get the bit at specific position)


        //Position is an index of the bit from the right side starting with 0
        int n=5;
        int pos=2;
        int bitMask = 1<<pos;

        if((n & bitMask) == 0){
            System.err.println("Bit was 0.");
        }else{
            System.err.println("Bit was 1");
        }


        //SET BIT (Here we change the bit at specific position to 1 using 'bitwise OR')


        pos=1;// for n=5 bits are 0101 so at position 1 there is 0 we will change it to 1
        n=5;
        bitMask=1<<pos; // here we shift the 1 i.e 0001 to 0010

        System.out.println(n | bitMask); // Here we did 0101 OR 0010 which gave 0111 i.e 7



        //CLEAR BIT (Here we will clear the 1 value of bit to 0 at a specific position)


        n=5;
        pos=2;
        bitMask=1<<pos;
        
        System.out.println(n & (~bitMask));


        // UPDATE BIT (Here we update a bit at a specific position)

        n=5; //0101
        pos=1;
        bitMask=1<<pos; //0010
          
        // to update to 0
            System.out.println(n&(~bitMask));
        // to update to 1
            System.out.println(n|bitMask);


    }
}
