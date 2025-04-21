class operators{
    public static void main(String[] args){
        double p = 5.0;
        int q = 3;
        System.out.println(p * q); // Output: 15.0 (double * int = double)
        System.out.println(p / q); // Output: 15.0 (double / int = double)
        System.out.println(p + q); // Output: 15.0 (double + int = double)

        //post increment

        int num1 = 7;
        int result = num1++; // result = 7, num1 = 8 (post-increment) => first assigns num1 to result, then increments num1
        System.out.println("Post-increment: " + result); // Output: 7

        //pre increment

        int num2 = 7;
        int result2 = ++num2; // result2 = 8, num2 = 8 (pre-increment) => first increments num2, then assigns it to result2
        System.out.println("Pre-increment: " + result2); // Output: 8


        //RELATIONAL OPERATORS -> in notes file
    }
}