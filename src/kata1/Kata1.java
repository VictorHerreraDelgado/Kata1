package kata1;

import java.time.LocalDate;


public class Kata1 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1998,12,29);     
        Person person = new Person("Victor",date);
        System.out.println( person.getName() + " tiene " + person.getAge()
                    + " años.");        
    }
    
}
