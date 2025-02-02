import java.util.Scanner;

//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("How many days would you like to convert to seconds?");
//        int number = Integer.parseInt(scanner.nextLine());
//        System.out.println(number + " days = " + (number * ((60*60)*24)));
//    }
//}

//class CalculationInSteps{
//    public static void main(String[] args) {
//        int first = (1 + 1);
//        int second = first + 3 * (2 + 5);
//
//        first = 5;
//        int third = first + second;
//        System.out.println(first);
//        System.out.println(second);
//        System.out.println(third);
//    }
//}

class simpleLoop{
    public static void main(String[] args) {
        int number = 0;

        while (true) {
            number += 1;
            if (number >= 5) {
                break;
            }

            if (number < 5) {
                continue;
            }
            System.out.print(number + " ");
        }

        System.out.print(number + " ");
    }

}