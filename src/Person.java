import java.time.LocalDate;

//Syntax for creating an object
//Example: Encapsulation
public class Person extends Employee {
    //abstract classes
    //interfaces
    //Enumerations
    //char, int, float (3.0)


    private String firstname;

    private String lastname;

    private String position;

    private LocalDate dateOfBirth = LocalDate.of(1995, 8, 1);

    //getters and setters
    public String getFirstName() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setFirstname(String name) {
        firstname = name;
    }

    public void setLastname(String last) {
        lastname = last;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate date) {
        dateOfBirth = date;
    }

    @Override
    public String toString() {
        return firstname + " " +  lastname + " " + dateOfBirth.toString();
    }

    @Override
    String performRole() {
        System.out.println("Performing my role: !!!!!#");
        return "Role Performed";
    }
}

