import java.util.ArrayList;
import java.util.Scanner;

public class WorkHistory {
    private String company;
    private String title;
    private int yearStart;
    private int yearEnd;
    private String description;

    Scanner user = new Scanner(System.in);
    public WorkHistory() {

    }

    public WorkHistory(String company, String title, int yearStart, int yearEnd,
                       String description) {
        this.company = company;
        this.title = title;
        this.yearStart = yearStart;
        this.yearEnd = yearEnd;
        this.description = description;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearStart() {
        return yearStart;
    }

    public void setYearStart(int yearStart) {
        this.yearStart = yearStart;
    }

    public int getYearEnd() {
        return yearEnd;
    }

    public void setYearEnd(int yearEnd) {
        this.yearEnd = yearEnd;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDisplayText() {

        return "Company Name: " + getCompany() + "\n" + "Your position title: " + getTitle() + "\n"
                + "Start Date: " + getYearStart() + "\t" + "End Date: " + getYearEnd() +
                "\n" + "Job description:\n" + description;
    }
}


//    public String DistplayText() {
//        String msg = "";
//        for (int i = 0; i < getDescription(); i++) {
//            msg = msg + getDescription(i) + "\n";
//        }
//        return getCompany() + "\n" +
//                getCompany() + ", " + getYearStart() + " - " + getYearEnd() + "\n" + msg;
//}