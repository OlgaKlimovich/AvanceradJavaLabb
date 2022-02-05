/*Skapa en klass Person med fälten (variablerna):
private String name,
private String gender,
private double salary
Skapa en lista, och fyll den med 10 stycken sådana personer.
Med hjälp av streams, räkna ut:
1.1 Snittlönen för kvinnorna respektive männen i listan
1.2. Vem som har högst lön totalt
1.3. Vem som har lägst lön totalt.*/

package question1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Question1 {
    public static void main(String[] args) {
        List<Person>persons=List.of(
                new Person("Alex Andersson","man",500000),
                new Person("Lena Nilsson","woman",550000),
                new Person("Daniel Olsson","man",650000),
                new Person("Donna Ardo","woman",750000),
                new Person("Carol Slezak","man",590000),
                new Person("Johanna Gustavsson","woman",850000),
                new Person("Mark Sjöstrand","man",530000),
                new Person("Brian Ruth","man",700000),
                new Person("Thomas Perou","man",600000),
                new Person("Alexander Lind","man",400000)
        );

        //Snittlönen för kvinnorna respektive männen i listan
        System.out.println("Snittlönen för kvinnorna är " + persons
                .stream()
                .filter(l->l.getGender().equals("woman"))
                .collect(Collectors.averagingDouble(Person::getSalary))
        );

        System.out.println("Snittlönen för männen är " + persons
                .stream()
                .filter(l->l.getGender().equals("man"))
                .collect(Collectors.averagingDouble(Person::getSalary))
        );

        //Vem som har högst lön totalt
        System.out.println("Högst lön har " + persons
                .stream()
                .max(Comparator.comparing(Person::getSalary))
        );

        //Vem som har lägst lön totalt
        System.out.println("Lägst lön har " + persons
                .stream()
                .min(Comparator.comparing(Person::getSalary))
        );
    }
}

