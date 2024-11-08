public class politicalDictator extends leader implements actions {
    private String partyName;

    public politicalDictator(String name, String country, int yearsInPower, String partyName) {
        super(name, country, yearsInPower);
        this.partyName = partyName;
    }

    @Override
    public String implementPolicy(String policy) {
        return "Politiske diktator " + name + " implementere en ny politik " + policy;
    }

    @Override
    public String doesGenocide() {
        return "Politiske diktator " + name + " laver heldigvis ikke folkemord, kun minkmord";
    }

    @Override
    public String holdParade() {
        return "Politiske diktator " + name + " holder et rally for hendes følgere";
    }

    @Override
    public String giveSpeech() {
        return "Politiske diktator " + name + " giver en tale omkring socialdemokratiets politik.";
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Parti navn: " + partyName);
    }
}