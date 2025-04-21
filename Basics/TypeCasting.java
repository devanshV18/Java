class typecasting {
    public static void main(String[] args){
        // int x = 5.6f; //not allowed in ajva due to lossy conversion.
        
        //float to int is done explicitly.
        float pi = 3.14f;
        int x = (int) pi;  // ✅ Works, x becomes 3 (truncates the .14 part)
        System.out.println(x); 


        //Checking out explicit conversion of an integer value to byte as it is also not allowed implicitly.
        int a = 257; //integer grater tahn byte range
        //Explicitly converting it to byte (Narrowing conversion) 
        byte b = (byte) a; // ✅ Works, b becomes 1 (truncates the 2) -128 to 127 byte range
        System.out.println(b); // 1 -> Explanation in notes file.

        int op = 5;
        byte di = (byte) op;
        System.out.println(di); //prints 5 as this conversion is within the range of byte.

        //example 3

        int yum = 258;
        byte gum = (byte) yum;
        System.out.println(gum); //prints 2 -> simple explaanation -> 258 (out of byte range) thus the compiler performs => 258 % (256 -> no. of values that can be accomodated in byte) = 2


        //type promotion

        byte an = 10;
        byte bn = 30;

        // byte cn = a * b; //since the value is out of range of byte after multiplication, this throws an runtime error. as lossy conversion
        // System.out.println(cn); 

        int dn = an * bn; //compiler promotes the byte to int and then performs the multiplication.
        System.out.println(dn); //works well
    }
}