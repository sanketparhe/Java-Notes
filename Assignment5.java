import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * AssignmentNo5
 * 
 * 11 Dec 23
 */
public class Assignment5 {

    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        Scanner sc = new Scanner(System.in);

        // Program no-1

        // System.out.println("Enter a Radius of Circle");
        // double Radius=Double.parseDouble(br.readLine());
        // double pi=3.14;
        // double Area=pi*Radius*Radius;
        // System.out.println("Area Of Square is : "+Area);

        // Program 2: Write a program that takes electricity unit charges as input and
        // calculate total electricity bill according to the given condition: For first
        // 50 units Rs. 0.50/unit For next 100 units Rs. 0.75/unit For next 100 units
        // Rs. 1.20/unit For unit above 250 Rs. 1.50/unit.

        // Program 3: Ask user to enter age, sex ( M or F ), marital status ( Y or N )
        // and then using following rules print their place of service. if employee is
        // female, then she will work only in urban areas. if employee is a male and age
        // is in between 20 to 40 then he may work in anywhere if employee is male and
        // age is in between 40 t0 60 then he will work in urban areas only. And any
        // other input of age should print "ERROR".

        // System.out.println("Enter Your age");
        // int age = Integer.parseInt(br.readLine());
        // System.out.println("Enter Your Sex");
        // String Sex = br.readLine();
        // System.out.println("Enter Your Marital Status");
        // String Status = br.readLine();

        // if ((Sex.equals("Female") || (Sex.equals("female")))) {
        // System.out.println("will work only in urban areas.");
        // } else if ((Sex.equals("Male") && (age > 20 && age < 40))) {
        // System.out.println("may work in anywhere");
        // } else if ((Sex.equals("Male") && (age > 40 && age < 60))) {
        // System.out.println("will work in urban areas only");
        // } else {
        // System.out.println("Error");
        // }
        // Program No-4
        // 2468
        // 2468
        // 2468
        // 2468

        // int i,j;
        // for(i=1; i<=4; i++){
        // for(j=1; j<=4; j++){

        // System.out.print(j*2);
        // }
        // System.out.println();
        // }

        // Program No-5
        // Program 5: Write a program to ASCII values of input character.
        // Input: A
        // Output: ASCII Value of A is 65

        System.out.println("Enter a Character");
        char InputValue = sc.next().charAt(0); // SScanner class get char input
        // char inputvalue=(char) br.read(); Bufferreader
        int Accivalue = (char) InputValue;

        System.out.println("The ASCCI of " + InputValue + " is " + Accivalue);
    }
}