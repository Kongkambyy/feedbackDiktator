public class Main {
    public static void main(String[] args) {

        //Arrayliste der opretter vores diktatore
        militaryDictator militaryDictator = new militaryDictator("Gaddafi", "Libyen", 40, "Colonel");
        politicalDictator politicalDictator = new politicalDictator("Mette Frederiksen", "Danmark", 7, "Socialdemokratiet");

        //Forbinder arraylisten til den abstrakte klasse leaders
        leader[] leaders = {militaryDictator, politicalDictator};

        //abstrakte og konkrete metode
        for (leader leader : leaders) {
            leader.printDetails();
            System.out.println(leader.giveSpeech());


            if (leader instanceof actions) {
                actions actions = (actions) leader;
                System.out.println(actions.implementPolicy("Enestyre"));
                System.out.println(actions.doesGenocide());
                System.out.println(actions.holdParade());
            }
            System.out.println();
        }


    }
}