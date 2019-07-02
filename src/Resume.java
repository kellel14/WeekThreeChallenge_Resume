import java.lang.reflect.Array;
import java.util.ArrayList;

public class Resume {
    private static ArrayList<Contact>myContact;
    private static ArrayList<Education> myEducation;
    private static ArrayList<WorkHistory> myWorkHistory;
    private static ArrayList<ProficiencyRating> mySkills;


//    public static Contact myResume = new Contact();
//    public static void Main (String[] args){


    public Resume() {
        myContact = new ArrayList<Contact>();
        myEducation = new ArrayList<Education>();
        myWorkHistory = new ArrayList<WorkHistory>();
        mySkills = new ArrayList<ProficiencyRating>();

    }

    public Contact getCOntact(int ith){
        Contact theContact = this.myContact.get(ith);
        return theContact;
    }

    public Education getEducation(int ith){
        Education theEducation = this.myEducation.get(ith);
        return theEducation;
    }

    public void addEducation(Education education_hist){
        myEducation.add(education_hist);
    }

    public int getEducation_id(){
        return myEducation.size();
    }

    public WorkHistory getWorkHist(int ith){
        WorkHistory theWorkHist = this.myWorkHistory.get(ith);
        return theWorkHist;
    }

    public void addWorkHist(WorkHistory work){
        myWorkHistory.add(work);
    }

    public int getWorkHist_id(){
        return myWorkHistory.size();
    }
    public ProficiencyRating getSkills(int ith){
        ProficiencyRating theSkill = this.mySkills.get(ith);
        return theSkill;
    }

    public void addSkill(ProficiencyRating skills){
        mySkills.add(skills);
    }

    public int getSkill_id(){
        return mySkills.size();
    }






//    public Name getNames(int ith) {
//        Name theName = this.myName.get(ith);
//        return theName;
//    }
//
//    public static ArrayList<Name> getMyName() {
//        return myName;
//    }
//
//    public static void setMyName(ArrayList<Name> myName) {
//        Resume.myName = myName;
//    }
//
//    public static ArrayList<Email> getMyEmail() {
//        return myEmail;
//    }
//
//    public static void setMyEmail(ArrayList<Email> myEmail) {
//        Resume.myEmail = myEmail;
//    }
//
//    public static ArrayList<PhoneNumber> getMyNumber() {
//        return myNumber;
//    }
//
//    public static void setMyNumber(ArrayList<PhoneNumber> myNumber) {
//        Resume.myNumber = myNumber;
//    }
//
//    public static ArrayList<Education> getMyEducation() {
//        return myEducation;
//    }
//
//    public static void setMyEducation(ArrayList<Education> myEducation) {
//        Resume.myEducation = myEducation;
//    }
//
//    public static ArrayList<WorkHistory> getMyWorkHistory() {
//        return myWorkHistory;
//    }
//
//    public static void setMyWorkHistory(ArrayList<WorkHistory> myWorkHistory) {
//        Resume.myWorkHistory = myWorkHistory;
//    }
//
//    public static ArrayList<ProficiencyRating> getMySkills() {
//        return mySkills;
//    }
//
//    public static void setMySkills(ArrayList<ProficiencyRating> mySkills) {
//        Resume.mySkills = mySkills;
//    }
}