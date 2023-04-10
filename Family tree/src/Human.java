import java.util.List;

public class Human {

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

    public String getInfo() {

        StringBuilder infoHuman = new StringBuilder();
        infoHuman.append(name+"\n");
        infoHuman.append(father.name +" - Отец\n");
        infoHuman.append(mother.name +" - Мать\n");
        infoHuman.append("\n");
        return infoHuman.toString();
    }
}