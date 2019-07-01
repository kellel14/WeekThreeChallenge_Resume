import java.util.Scanner;

public class Contact {
    private String Name;
    private String Email;
    private long phoneNumber;


    Scanner user = new Scanner(System.in);
    //should include name, email, phone number


    public Contact() {
    }

    public Contact(String name, String email, long phoneNumber) {
        this.Name = name;
        this.Email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = user.nextLine();
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = user.nextLine();
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = user.nextLong();
    }
}
