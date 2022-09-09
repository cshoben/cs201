import java.io.IOException;
import java.util.List;

public class Person201Finder {
    public static void main(String[] args) throws IOException{
        Person201 myself = new Person201("Chelsea Shoben", "FFSC", 4);
        Person201[] cs201 = Person201Utilities.readURL("https://courses.cs.duke.edu/compsci201/fall22/people.txt");

        System.out.println("\nSearching for people near " + myself.getName() + "\n");

        System.out.println("People on the same floor: ");
        List<Person201> sameFloor = Person201Utilities.sameFloor(cs201, myself);
        Person201Utilities.printPeople(sameFloor);

        System.out.println("People in the same building: ");
        List<Person201> sameBuilding = Person201Utilities.sameBuilding(cs201, myself);
        Person201Utilities.printPeople(sameBuilding);
    }
}
