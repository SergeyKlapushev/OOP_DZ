import java.io.Serializable;
import java.util.List;

public class Human implements Serializable{

    private String name;
    private Human father;
    private Human mother;
    private List<Human> children;

    public Human(String name, Human father, Human mother) {
        this.name = name;
        this.father = father;
        this.mother = mother;
    }

    public Human(String name) {
        this.name = name;
    }

    public Human() {
    }

    public String setName(String name) {
        return this.name = name;
    }

    public List<Human> addName(Human child) {
        children.add(child);
        return children;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return name + "\n Отец - " + father.getName() + "\n Мать - "+ mother.getName();
    }
}