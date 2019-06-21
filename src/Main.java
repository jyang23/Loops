import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //Task 1
        for (int i = 1; i <= 10; i++) {
            if (i == 10) {
                System.out.println(i);
            } else {
                System.out.print(i + ", ");
            }
        }

        //Task 2
        for (int i = 10; i >= 1; i--) {
            if (i == 1) {
                System.out.println(i);
            } else {
                System.out.print(i + ", ");
            }
        }

        //Task 3
        for (int i = 1; i <= 20; i++) {
            if (!(i % 2 == 0)) {
                if (i == 19) {
                    System.out.println(i);
                } else {
                    System.out.print(i + ", ");
                }
            }
        }

        //Task 4
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                if (i == 20) {
                    System.out.println(i);
                } else {
                    System.out.print(i + ", ");
                }
            }
        }

        //Task 5
        int input;
        System.out.println("Hello, please enter a number: ");
        input = in.nextInt();
        for (int i = input; i >= 1; i--) {
            if (i == 1) {
                System.out.println(i);
            } else {
                System.out.print(i + ", ");
            }
        }
        //Task 6
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        //Task 7
        int sum2 = 0;
        int input2;
        System.out.println("Enter a number: ");
        input2 = in.nextInt();
        for (int i = 1; i <= input2; i++) {
            sum2 = sum2 + i;
        }
        System.out.println(sum2);


        //Task 8.1
        int i = 0;
        for(i = 1;i<=40;i++)
        {
            System.out.print("*");
            if((i == 10) || (i == 20) || (i == 30) || (i == 40)){
                System.out.println();
            }
        }

        //Task 8.2
        i = 0;
        for(i = 1;i<=5;i++)
        {
            if(i == 1) {
                System.out.println("*");
            }
            else if(i == 2) {
                System.out.print("*");
                System.out.println("*");
            }
            else if(i == 3) {
                System.out.print("*");
                System.out.print("*");
                System.out.println("*");
            }
            else if(i == 4) {
                System.out.print("*");
                System.out.print("*");
                System.out.print("*");
                System.out.println("*");
            }
            else {
                System.out.print("*");
                System.out.print("*");
                System.out.print("*");
                System.out.print("*");
                System.out.println("*");
            }
        }
        //Task 8.3
        i = 0;
        for(i = 1;i<=5;i++)
        {
            if(i == 1) {
                System.out.print(" ");
                System.out.print(" ");
                System.out.print(" ");
                System.out.print(" ");
                System.out.println("*");
            }
            else if(i == 2) {
                System.out.print(" ");
                System.out.print(" ");
                System.out.print(" ");
                System.out.print("*");
                System.out.println("*");
            }
            else if(i == 3) {
                System.out.print(" ");
                System.out.print(" ");
                System.out.print("*");
                System.out.print("*");
                System.out.println("*");
            }
            else if(i == 4) {
                System.out.print(" ");
                System.out.print("*");
                System.out.print("*");
                System.out.print("*");
                System.out.println("*");
            }
            else {
                System.out.print("*");
                System.out.print("*");
                System.out.print("*");
                System.out.print("*");
                System.out.println("*");
            }
        }

        //Task 10
        int factorial = 1;
        int input3;
        System.out.println("Enter a number: ");
        input3 = in.nextInt();
        for (i = input3; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);

    }

}
