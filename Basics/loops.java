class loops{
    public static void main(String[] args){

        //While loop demonstration ->

        int i = 1; //initialisation of a variable.
        while (i <= 5) { //check the condition
            System.out.println(i);
            i++;  // updation
        }


        //do while loop -> first loop is entered and then the condition is checked at the end of each iteration. hence the loop runs at least once.
        int j = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);


        // for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}