import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
public class FindingList {
    public FindingList() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("Welcome back, Time to document everything you found.");
        System.out.println("Rock data downloaded.");
        ArrayList<String> rocks = new ArrayList<String>(Arrays.asList("rock", "weird rock", "smooth rock", "not rock"));

        rocks.forEach(name -> System.out.println(name));
        System.out.println("The last element in the list is not a rock we need to delete it.");
        rocks.remove("not rock");
        rocks.forEach(name -> System.out.println(name));
        System.out.println("Great!!!");
        Thread.sleep(1000);
        HashMap<String, String> fossils = new HashMap<>();
        
        fossils.put("Bird", "The fossil has wings implying it was capable of flight");
        fossils.put("Fish", "The fossil is vaguely fish shaped implies there was once water");
        fossils.put("Tooth", "The tooth from an unknown fossil");

        System.out.println("Fossil data downloaded");
        System.out.println("Which of the fossils would you like to learn more about (Bird, fish, tooth)?");

        Scanner input = new Scanner(System.in);
        String fossilChoice = input.nextLine();
        fossilChoice = fossilChoice.substring(0, 1).toUpperCase() + fossilChoice.substring(1);
        
        System.out.printf("Fossil: %s \nDescription: %s\n", fossilChoice, fossils.get(fossilChoice));
        Thread.sleep(700);
        HashSet<String> supplies = new HashSet<String>();

        supplies.add("First aid kit");
        supplies.add("Swiss knife");
        supplies.add("Compass");

        Iterator i = supplies.iterator();
        System.out.println("Supplies Before Expedition");
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        
        supplies.remove("Compass");
        i = supplies.iterator();
        System.out.println("Supplies after Expedition");
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        
    }
}
