import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class person {
    String surname;
    String firstname;
    String street;
    String zipCode;
    String city;

    public void initialize() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter surname: ");
        surname = br.readLine();
        System.out.println("Enter firstname: ");
        firstname = br.readLine();
        System.out.println("Enter street: ");
        street = br.readLine();
        System.out.println("Enter zip code: ");
        zipCode = br.readLine();
        System.out.println("Enter city: ");
        city = br.readLine();
    }

    public void print() {
        System.out.println("surname:- " + surname);
        System.out.println("firstname:- " + firstname);
        System.out.println("street:- " + street);
        System.out.println("zipCode:- " + zipCode);
        System.out.println("city:- " + city);
    }
}

class Staff extends person {
    private String education, position;

    public void initialize1() throws IOException {
        initialize(); // Calling the initialize method from the Person class
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter education: ");
        education = br .readLine();
        System.out.println("Enter position: ");
        position = br .readLine();
    }

    public void print1() {
        print(); // Calling the print method from the Person class
        System.out.println("Education:-" + education);
        System.out.println("Position:-" + position);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        Staff staffMember = new Staff();
        staffMember.initialize1();
        staffMember.print1();
    }
}
