import java.time.LocalDate;

/**
 * @author ${USER}
 */
public class Main {

    //MAIN METHOD
    //accessor modifier return type name
    public static void main(String[] args) {
        //code to execute
//        Person ola = new Person();
//        ola.setFirstname("Ola");
//        ola.setLastname("Last");
//        ola.setDateOfBirth(LocalDate.of(1991, 1, 1));
//        System.out.println(ola);
//
        Person two = new Person();
        two.setFirstname("Persontwo");
        two.setLastname("Lastname");
        two.setDateOfBirth(LocalDate.of(1998, 2, 2));
        System.out.println(two.performRole());
        System.out.println(two);

        Intern one = new Intern();
        System.out.println(one.performRole());



    }
}

