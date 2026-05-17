package footsys.project.model;

public class Manager extends Person {
    String Tactics;
    int Wins, Draws, Losses;
    public Manager(String name, int age, double wagepw, double bonus, String Tactics, int Wins, int Draws, int Losses)
    {
        super(name,age,wagepw,bonus);
        this.Tactics = Tactics;
        this.Wins = Wins;
        this.Draws = Draws;
        this.Losses = Losses;
    }
    public double wage()
    {
        return wagepw + bonus;
    }
    public String getdetails() {
        return super.getdetails() + "Tactic: "+ Tactics +" | Wins:  "+ Wins+" | Draws:  " + Draws+" | Losses:  " + Losses;
    }
}
