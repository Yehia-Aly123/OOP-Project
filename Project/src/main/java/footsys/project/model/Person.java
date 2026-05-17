package footsys.project.model;

public abstract class Person {
    String name;
    int age;
    double wagepw;
    double bonus;

    public Person(String name,int age,double wagepw, double bonus)
    {
        this.name = name;
        this.age = age;
        this.wagepw = wagepw;
        this.bonus = bonus;
    }
    public String getdetails(){
        return "Name: "+name + " | Age: "+age+" | Wagepw: "+wagepw;
    }
    public abstract double wage();
}
