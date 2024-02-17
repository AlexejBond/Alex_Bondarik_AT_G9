package homework.day4.playground.essence;

public abstract class Matter {


    protected int mass;
    public String name;


    public Matter(int mass, String name) {
        this.mass = mass;
        this.name = name;
    }


    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

}
