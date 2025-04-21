class conditionals{
    public static void main(String[] args){
        int age;
        age = 18;

        if(age >= 18){
            System.out.println("You can drive!");
        }
        else if(age >= 16){
            System.out.println("You can drive with a permit!");
        }
        else{
            System.out.println("You cannot drive yet!");
        }

        int x = 8;
        int y = 7;
        int z = 6;

        if(x>y && x>z){
            System.out.println("x is the largest number!");
        }
        else if(y>x && y>z){
            System.out.println("y is the largest number!");
        }
        else{
            System.out.println("z is the largest number!");
        }

        //Ternary Operator
        // condition ? do if true : do if false
        
        int n = 4;
        int result = (n%2==0) ? 1 : 0;
        System.out.println("The result is: " + result);

    }

    
}