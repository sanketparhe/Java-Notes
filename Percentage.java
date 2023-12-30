import java.util.Scanner;
public class Percentage {
  public static void main(String[] args) {
    float numberOfSubjects=5;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Full Marks: ");
    float fm=sc.nextFloat();
    System.out.print("Enter 2nd language: ");
    String secondLanguage=sc.next();
    System.out.print("Enter English Marks: ");
    float engMarks=sc.nextFloat();
    System.out.print("Enter "+secondLanguage+" Marks: ");
    float secondLanguageMarks=sc.nextFloat();
    System.out.print("Enter Maths Marks: ");
    float mathsMarks=sc.nextFloat();
    System.out.print("Enter Science Marks: ");
    float scienceMarks=sc.nextFloat();
    System.out.print("Enter SSt Marks: ");
    float sstMarks=sc.nextFloat();
    float totalMarksPercentage=((engMarks+secondLanguageMarks+mathsMarks+scienceMarks+sstMarks)/(fm*numberOfSubjects))*100;
    System.out.println("You scored "+totalMarksPercentage+"% in total");
  }
}