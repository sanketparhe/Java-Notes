public class Assignment3 {
    public static void main(String[] args) {

        System.out.println("**Q1.******************** Uppercase,Lowercase Assignment ***************************");
        char a = 97;
        if (a >= 65 && a <= 90) {
            System.out.println("It is Uppercase : " + a);
        } else {
            System.out.println("It is a Lower case : " + a);
        }

        System.out.println("**Q2.******************************** Switch Case ********************************");

        int day = 2;
        switch (day) {
            default:
                System.out.println("number invalid");
                break;

            case (1):
                System.out.println("Sunday");
                break;

            case (2):
                System.out.println("Monday");
                break;

            case (3):
                System.out.println("Tuesday");
                break;

            case (4):
                System.out.println("Wednesday");
                break;

            case (5):
                System.out.println("Thursday");
                break;

            case (6):
                System.out.println("Friday");
                break;

            case (7):
                System.out.println("Saturday");
                break;

        }

        System.out.println("**Q3.******************************** Switch Case ********************************");

        int month = 11;
        switch (month) {
            default:
                System.out.println("number invalid.");
                break;

            case (1):
                System.out.println("January is a 31 days month.");
                break;

            case (2):
                System.out.println("February is a 28 days (29 on leap years).");
                break;

            case (3):
                System.out.println("March is a 31 days month.");
                break;

            case (4):
                System.out.println("April is a 30 days month.");
                break;

            case (5):
                System.out.println("May is a 31 days month.");
                break;

            case (6):
                System.out.println("June is a 30 days month.");
                break;

            case (7):
                System.out.println("July is a 31 days month.");
                break;

            case (8):
                System.out.println("August is a 31 days month.");
                break;

            case (9):
                System.out.println("September is a 30 days month.");
                break;

            case (10):
                System.out.println("October is a 31 days month.");
                break;

            case (11):
                System.out.println("November is a 30 days month.");
                break;

            case (12):
                System.out.println("December is a 31 days month.");
                break;

        }

         System.out.println("**Q4.******************************** For Loop ********************************");
           
         
         for(int i=1; i<=4; i++){
            for(int j=1; j<=4; j++){
                System.out.print(" "+j);
            }
             System.out.println();
         }

          System.out.println("**Q5.******************************** Triangle ********************************");

          int a1=30;
          int a2=60;
          int a3=70;
          int total=a1+a2+a3;
          if(total==180){
            System.out.println("Valid");
          }else{
            System.out.println("Invalid");
          }
    }
    
}
