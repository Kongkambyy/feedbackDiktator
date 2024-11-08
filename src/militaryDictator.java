public class militaryDictator extends leader implements actions {
    private String militaryRank;

    public militaryDictator(String name, String country, int yearsInPower, String militaryRank) {
        super(name, country, yearsInPower);
        this.militaryRank = militaryRank;
    }

    @Override
    public String implementPolicy(String policy) {
        return "Militær diktatoren " + name + " implementere en ny poltik: " + policy;
    }

    @Override
    public String doesGenocide() {
        return "Militær diktatoren " + name + " laver desværre folkemord på den libyske befolkning.";
    }

    @Override
    public String holdParade() {
        return "Militær diktatoren " + name + " holder en militær parade";
    }

    @Override
    public String giveSpeech() {
        return "Militær diktatoren " + name + " holder tale omkring vigtigheden i et stærkt militær";
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Militær rank: " + militaryRank);
    }
}