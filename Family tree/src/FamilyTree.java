import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    private List<Human> listHumans;

    public FamilyTree() {
        this(new ArrayList<>());
    }

    public FamilyTree(List<Human> listHumans) {
        this.listHumans = listHumans;
    }

    public void addBranch(Human human) {
        listHumans.add(human);
    }

    public void addBranch(Human human, Human father, Human mother) {
        listHumans.add(human);
        listHumans.add(father);
        listHumans.add(mother);
    }

    public void addBranch(Human human, Human father, Human mother, List<Human> childs) {
        listHumans.add(human);
        listHumans.add(father);
        listHumans.add(mother);

        for (Human child : childs) {
            listHumans.add(child);
        }
    }
}