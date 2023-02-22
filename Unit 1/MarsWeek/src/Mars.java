public class Mars {
    public static void main(String[] args) throws Exception {
        String colonyName = "Marshall";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;
        meals = meals - (shipPopulation * 0.75);
        meals = meals - (shipPopulation * 0.75);
        System.out.println(meals);
        meals = meals + (meals * .5);
        shipPopulation = shipPopulation + 5;
        String[] landings = {"The Hill", "The Plain", "The Ocean"};
        String landingLocation = "The Plain";
        for (String el : landings) {
            if (el.equalsIgnoreCase(landingLocation)) {
                System.out.println("Bbzzz Landing on the Plain");
            } else {
                System.out.println("ERROR!!! Flight plan already set. Landing on The Plain");
            }
        }
        new GuessingGame();
        new MarsExpedition();
        new FindingList();
    }

    public static boolean landingCheck(int minutesLeft) throws InterruptedException {
        for (int minute =0; minute <= minutesLeft; minute++) {
            if (((minute % 3) == 0) && ((minute % 2) == 0)) {
                System.out.println("Keep Center");
            } else if ((minute % 2) == 0) {
                System.out.println("Right");
            } else if ((minute % 3) == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("landed");
        return false;
    }
    
}
