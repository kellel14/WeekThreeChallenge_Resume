import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Scanner user = new Scanner(System.in);
    // place in loop
    //begin loop for contact info
        System.out.println("Enter your name.");
        String name = user.nextLine();
        System.out.println("Enter your email.");
        String email = user.nextLine();
        System.out.println("Enter your phone number.");
        long phoneNum = user.nextLong();
        //end loop

        System.out.println("Let's add your education.");

        //new loop for education

        System.out.println("Enter the college you attended.");
        String college = user.nextLine();
        System.out.println("Enter your major.");
        String collegeMajor = user.nextLine();
        System.out.println("Enter your degree");
        String collegeDegree = user.nextLine();
        System.out.println("Enter your graduation year.");
        int collegeYear = user.nextInt();
        //end of loop

        System.out.println("Let's add your work History");

        //begin new loop for work history
        System.out.println("Enter the company you worked for.");
        String workCompany = user.nextLine();
        System.out.println("Enter your job title.");
        String workTitle = user.nextLine();
        System.out.println("Enter your start date.");
         int workStart = user.nextInt();
        System.out.println("Enter your end date.");
        int workEnd = user.nextInt();
        System.out.println("Enter your job description.");
        String workDescription = user.nextLine();

        //end loop

        //begin loop for skill level
        System.out.println("List your skills and state whether you are:" +
                "Fundamental\t\tNovice\t\tIntermediate\t\tAdvanced\t\tExpert.");
        String skillLvl = user.nextLine();


    }
}
