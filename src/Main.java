import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Contact> contactList = new ArrayList<Contact>();
        ArrayList<Education> educationList = new ArrayList<Education>();
        ArrayList<WorkHistory> workList = new ArrayList<WorkHistory>();
        ArrayList<ProficiencyRating> skillList = new ArrayList<ProficiencyRating>();

        Scanner user = new Scanner(System.in);
        // place in loop
        //begin loop for contact info
        while () {
            System.out.println("Enter your name.");
            String name = user.nextLine();
            System.out.println("Enter your email.");
            String email = user.nextLine();
            System.out.println("Enter your phone number.");
            long phoneNum = user.nextLong();
            //end loop
        }
        Resume myResume = new Resume();
        myResume.getContact().setName();
        myResume.getContact().setEmail;
        myResume.getContact().setPhoneNumber();


        //new loop for education
        System.out.println("Add your education. Type (y)");
        String response1 = user.nextLine();
        if (response1.equalsIgnoreCase("y")) {
            do {
                System.out.println("Enter the college you attended.");
                String college = user.nextLine();
                System.out.println("Enter your major.");
                String collegeMajor = user.nextLine();
                System.out.println("Enter your degree");
                String collegeDegree = user.nextLine();
                System.out.println("Enter your graduation year.");
                int collegeYear = user.nextInt();
                //allow user to keep adding until quit
                //end of loop


            } while ()
        }
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
        //allow user to keep adding until quit
        //end loop
        System.out.println("Would you like to enter a college degree? Type (y)");
        String response2 = user.nextLine();
        if (response2.equalsIgnoreCase("yes")) {
            do {

                //begin loop for skill level
                System.out.println("List your skills and state whether you are:" +
                        "Fundamental\t\tNovice\t\tIntermediate\t\tAdvanced\t\tExpert.");
                String skillLvl = user.nextLine();
                //allow user to keep adding until quit
                //end loop

            }while();
        }

    }
}



