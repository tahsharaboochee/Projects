import java.util.Scanner;
public class MarsExpedition {
    public MarsExpedition() {
        Scanner input = new Scanner(System.in);
        System.out.println("bootup");
        System.out.println("Loading Mars Expedition");
        for (int i = 0; i < 3; i++){
            System.out.println("...");
        }
        System.out.println("Ready");
        System.out.println("Hello, what is your name?");
        String name = input.next();
        System.out.printf("Hi, %s — Welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N\n", name);
        String answer = input.next();

        if (answer.equalsIgnoreCase("Y")) {
            System.out.println("I knew you would say that. You are team leader for a reason.");
        } else {
            System.out.println("To bad you are team leader. You have to go.");
        }

        System.out.println("How many people do you want on your expedition team?");

        int teamSize = input.nextInt();
        
        if (teamSize > 2) {
            System.out.println("That's way to many people. We can only send 2 more members");
            teamSize = 2;
        } else if (teamSize < 2) {
            System.out.println("That's not enough people. We need you and 2 more members.");
            teamSize = 2;
        } else if (teamSize == 2) {
            System.out.println("That's a perfect sized team. Good job.");
        }
        
        input.nextLine();
        System.out.println("You are allowed to bring one snack with you. What do you bring?");
        String snack = input.nextLine();
        System.out.printf("Nice choice, you will be bringing a %s with you\n", snack);
        System.out.println("You have the choice of 3 vehicles" +
        "\nA: A Toyota RAV4" +
        "\nB: A Subaru Forester" +
        "\nC: A Honda Accord");
        String vehicleChoice = input.nextLine();

        switch (vehicleChoice) {
            case "a":
            case "A":
                vehicleChoice = "a Toyota RAV4";
                break;
            case "b":
            case "B":
                vehicleChoice = "a Subaru Forester";
                break;
            case "c":
            case "C":
                vehicleChoice = "a Honda Accord";
                break;
            default:
                vehicleChoice = "your feet";
        }
        System.out.println("Your expedition team is now ready" +
                "\nLed by " + name + " with " + teamSize + " teammates." +
                "\nTo explore the surface of Mars using " + vehicleChoice + "." +
                "\nExploration team heads out in" +
                "\n3...." +
                "\n2...." +
                "\n1...." +
                "\nLets GO!");    
    }
}
