public class Name extends Contact {
    //extends to contact class
    //we want to store the names in array list
    //each new name will create a new list
    //allow name to be accessed in resumeApp
    private String firstName;
    private String middleIN;
    private String lastName;

    public Name(){
        super();
        super.setName();
    }

    public Name(String firstName, String middleIN, String lastName) {
        this.firstName = firstName;
        this.middleIN = middleIN;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleIN() {
        return middleIN;
    }

    public void setMiddleIN(String middleIN) {
        this.middleIN = middleIN;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
