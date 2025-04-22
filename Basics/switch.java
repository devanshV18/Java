class switchcase{
    public static void main(String[] args){
        int n = 4;

        //basic switch
        switch(n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;   
            case 7:
                System.out.println("Sunday");
                break; 
            default:
                System.out.println("Invalid day");
                break;              
        }

        //in current version of java, we can also use string in switch case.
        String day = "Monday";

        switch(day){
            case "Saturday", "Sunday":
                System.out.println("Wake up at 7AM");
                break;
            case "Monday":
                System.out.println("Wake up at 8:30 AM");
                break;
            default:
                System.out.println("Wake up at 6:30 AM");
                break;
        }

        //switch with new non break syntax
        String result = "";
        String Weekday = "Monday";

        switch(Weekday){
            case "Saturday", "Sunday" -> result = "Weekend";
            case "Monday" -> result = "back to work";
            default -> result = "Wait for the weekend";
        }

        System.out.println(result); //prints back to work

        //using this as a complete expression and storing the result in a variable
        String expressionWeekday = "Wednesday";
        String result2 = "";
        result2 = switch(expressionWeekday){
            case "Saturday", "Sunday" -> "Weekend";
            case "Monday" -> "Back to work";
            default -> "Wait for the weekend";
        };

        System.out.println(result2); // prints Wait for the weekend
    }
}