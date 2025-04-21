class variables{
    public static void main(String[] args){
        System.out.println(5+4);

        int num1 = 5;
        int num2 = 6;
        System.out.println(num1+num2);

        int rollnum = 89;
        byte age = 70;
        short shortnum = 32000;

        float floatnum = 5.6786788f;
        double doubleNum = 5.678678678678678d;

        char c = 'b';
        char dig = '5';

        boolean isTrue = false;

        long starsInGalaxy = 9876543210L;

        System.out.println(rollnum + age + shortnum);


        int binNum1 = 0b1010; //storing binary number
        int binNum2 = 0b101; //storing binary number
        int binNum3 = 0b10100; //storing binary number
        System.out.println(binNum1); // binary number
        System.out.println(binNum2); // binary number
        System.out.println(binNum3); // binary number


        //ASSIGNING AN INT TO A DOUBLE -> JAVA AUTOMATICALLY COVERRTS THE INT TO DOUBLE
        double d = 56;
        System.out.println(d); // 56.0

        //exploring char

        char ch = 'a';
        ch++; //increments ch to b
        System.out.println(ch);

        char n = '4';
        n++; //increments n to 5
        System.out.println(n); 

    }
}