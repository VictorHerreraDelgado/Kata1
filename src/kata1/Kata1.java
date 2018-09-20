package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Person person = new Person("Victor",new Date(98,11,29));
        System.out.println( person.getName() + " tiene " + person.getAge()
                    + " años.");        
    }
    
}
