package firstInterface;

public class Olympics implements Football,Hockey{

    @Override
    public void homeTeamScored(int points) {
        System.out.println("Gazdele au marcat " + points + " goluri");
    }

    @Override
    public void visitingTeamScored(int points) {
        System.out.println("Visitatorii au marcat " + points + " goluri");
    }

    @Override
    public void endOfQuarter(int quarter) {
        System.out.println(" Sfarsitul sfertului " + quarter);
    }

    @Override
    public void homeGoalScored() {
        System.out.println("au marcat gazdele");
    }

    @Override
    public void visitingGoalScored() {
        System.out.println("au marcat visitatorii");
    }

    @Override
    public void endOfPeriod(int period) {
        System.out.println("sfarsitul perioadei " + period);
    }

    @Override
    public void overtimePeriod(int ot) {
        System.out.println("Timp suplimentar ");
    }

    @Override
    public void setHomeTeam(String name) {
        System.out.println("Echipa gazada --> " + name);
    }

    @Override
    public void setVisitingTeam(String name) {
        System.out.println("Echipa visitatoare --> " + name);
    }

    public static void main(String args[]){
        Football fMatch = new Olympics();
        fMatch.setHomeTeam("U_Cluj");
        fMatch.setVisitingTeam("ScroafaDinGruia");
        fMatch.homeTeamScored(1);
        fMatch.visitingTeamScored(1);
        fMatch.endOfQuarter(4);

        Hockey hMatch = new Olympics();
        hMatch.setHomeTeam("Steaua");
        hMatch.setVisitingTeam("Dinamo");
        hMatch.homeGoalScored();
        hMatch.endOfPeriod(1);
        hMatch.visitingGoalScored();
        hMatch.overtimePeriod(2);
    }
}
