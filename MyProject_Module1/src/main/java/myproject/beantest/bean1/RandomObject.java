package myproject.beantest.bean1;

public class RandomObject {

    private int id;
    private String name;

    public RandomObject () {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return ("Balls ass " + this.getId() + " shit and stuff with value " + this.getName());
    }
}
