import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner firstNum = new Scanner(System.in);
        /*Scanner firstNum = new Scanner(System.in);  // Create a Scanner object
        //The Scanner class is used to get user input, and it is found in the java.util package.
        System.out.println("Enter First Number");

        int first1 = firstNum.nextInt();  // Read user input
        Scanner secondNum = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter second Number");

        int second2 = secondNum.nextInt();  // Read user input
        System.out.println("First Number is: " + first1);  // Output user input
        System.out.println("Second Number is: " + second2);  // Output user input
        //Use the if statement to specify a block of Java code to be executed if a condition is true.
        if (first1 > second2) {
            System.out.println("First Number Is Greater Than Second Number");
        }
        //Scanner firstAge = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter First age");

        int age1 = firstNum.nextInt();  // Read user input
        //Scanner secondAge = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter second Number");

        int age2 = secondNum.nextInt();  // Read user input
        System.out.println("First Number is: " + age1);  // Output user input
        System.out.println("Second Number is: " + age2);  // Output user input
        //Use the else statement to specify a block of code to be executed if the condition is false.
        if (age1 > age2) {
            System.out.println("First age Is Greater Than Second age");
        } else {
            System.out.println("Second Age Is Greater Than First Age");
        }
        //Use the else if statement to specify a new condition if the first condition is false.
        System.out.println("Enter The Marks Of Students");
        int marks = firstNum.nextInt();  // Read user input
        System.out.println("Student Marks is: " + marks);  // Output user input
        if (marks > 90 && marks <= 100) {
            System.out.println("Student Grade Is A");
        } else if (marks > 80 && marks <= 90) {
            System.out.println("Student Grade Is B");
        } else if (marks > 70 && marks <= 80) {
            System.out.println("Student Grade Is C");
        } else if (marks > 60 && marks <= 70) {
            System.out.println("Student Grade Is D");
        } else if (marks <= 60) {
            System.out.println("Student Fail");
        }
        //We use the for loop only when we exactly know the number of times, we want to execute the block of code.

        System.out.println("Enter The Range You Want To Sum");
        int range = firstNum.nextInt();  // Read user input
        System.out.println("Range Is: " + range);  // Output user input
        int sum = 0;
        for (int j = 1; j <= range; j++) {
            sum = sum + j;
        }
        System.out.println("The sum of given range natural numbers is " + sum);
        //In the for-each loop, we don't need to update the loop variable
        String[] names = {"Java", "C", "C++", "Python", "JavaScript"};
        System.out.println("Printing the content of the array names:\n");
        for (String name : names) {
            System.out.println(name);
        }
        //if we don't know the number of iterations in advance, it is recommended to use a while loop

        System.out.println("Enter The Range You Want To Find Even Numbers");
        int evenRange = firstNum.nextInt();  // Read user input
        System.out.println("Range Is: " + evenRange);  // Output user input
        int i = 0;
        System.out.println("Printing the list of first 10 even numbers \n");
        while (i <= evenRange) {
            System.out.println(i);
            i = i + 2;
        }
        //The do-while loop checks the condition at the end of the loop after executing the loop statements
        //When the number of iteration is not known ,and we have to execute the loop at least once, we can use do-while loop
        System.out.println("Enter The Range You Want To Find odd Numbers");
        int oddRange = firstNum.nextInt();  // Read user input
        System.out.println("Range Is: " + oddRange);  // Output user input
        int j = 1;
        System.out.println("Printing the list of given range odd numbers \n");
        do {
            System.out.println(j);
            j = j + 2;
        } while (j <= oddRange);*/
        System.out.println("Enter The Number You Want To Find The Day");
        int dayNum = firstNum.nextInt();  // Read user input
        System.out.println("Day Number Is: " + dayNum);  // Output user input
        if (dayNum >= 1 && dayNum <= 7) {
            if (dayNum % 2 == 0) {
                switch (dayNum) {
                    case 2:
                        System.out.println("monday");
                        break;
                    case 4:
                        System.out.println("wednesday");
                        break;
                    case 6:
                        System.out.println("Friday");
                        break;
                    default:
                        System.out.println("The Number Is Not Even Number");
                }
            }
        } else {
            switch (dayNum) {
                case 1:
                    System.out.println("Sunday");
                    break;
                case 3:
                    System.out.println("Tuedsay");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                default:
                    System.out.println("Saturday");
            }
        }
        System.out.println("Enter The Number you Want To check:");
        int num = firstNum.nextInt();  // Read user input
        System.out.println("Range Is: " + num);  // Output user input
        if (num >= 0){
            System.out.println("The Number Is Positive");
        }
        else{
            System.out.println("The NUmber Is Negative");
        }
    }
}