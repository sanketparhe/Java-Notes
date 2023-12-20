import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 12 Dec 2023
 * AssignmentNo6
 */
public class Assignment6 {

    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        // Program 1: Write a program to print First 10 Natural Numbers.
        // Output: 1 2 3 4 5 6 8 9 10

        // System.out.println("Enter a Number");
        // int Number = Integer.parseInt(br.readLine());
        // for (int i = 1; i <= Number; i++) {
        // System.out.println(i);
        // }

        // Program 2: Write a Program to print the Sum of First 10 Natural Number

        // Output: The sum of First 10 Natural Numbers: 55
        // int sum = 0;
        // System.out.println("Enter a Number");
        // int Number = Integer.parseInt(br.readLine());
        // for (int i = 1; i <= Number; i++) {
        // sum = sum + i;
        // }
        // System.out.println(sum);

        // Program 3:
        // Write a Program to print First 50 Odd Numbers.
        // int count = 0;
        // int number = 1;

        // System.out.println("First 50 Odd Numbers:");

        // while (count < 50) {
        // if (number % 2 != 0) {
        // System.out.print(number + " ");
        // count++;
        // }
        // number++;
        // }
        // Program 4: Write a Program to print First 50 Even Numbers

        // Output: 2 4 6 100
        // int count = 0;
        // int Number = 1;
        // System.out.println("Enter a Number");
        // int Limit = Integer.parseInt(br.readLine());
        // while (count < Limit) {
        //     if (Number % 2 == 0) {
        //         System.out.println(Number + " ");
        //         count++;
        //     }
        //     Number++;
        // }
        // Program No-5
        // 0000
        // 0000
        // 0000
        // 0000

        for(int i=1; i<=4; i++){
            for(int j=1; j<=4; j++){
                System.out.print("0");
            }
            System.out.println();
        }
    }
}