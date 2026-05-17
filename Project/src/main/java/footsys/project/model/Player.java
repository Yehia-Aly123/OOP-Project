package footsys.project.model;

public class Player extends Person {
    int Shirtnumber;
    String position;
    public Player(String name,int age,double wagepw,int Shirtnumber, String position, double bonus)
    {
        super(name, age, wagepw, bonus);
        this.Shirtnumber=Shirtnumber;
        this.position=position;
    }
    public double wage() {
        return wagepw;
    }
    public String getdetails() {
        return super.getdetails() + "Shirt Number: "+Shirtnumber+" | Position: "+position;
    }
}
