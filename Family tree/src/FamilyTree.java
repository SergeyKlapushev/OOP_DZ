import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class FamilyTree implements Iterable<Human> {
    private List<Human> humanList;

    public FamilyTree() {
        this.humanList = new ArrayList<>();
    }

    public FamilyTree(List<Human> humanList) {
        this.humanList = humanList;
    }

    public void addBranch(Human human) {
        humanList.add(human);
    }

    public void addBranch(Human human, Human father, Human mother) {
        humanList.add(human);
        humanList.add(father);
        humanList.add(mother);
    }

    public void addBranch(Human human, Human father, Human mother, List<Human> childs) {
        humanList.add(human);
        humanList.add(father);
        humanList.add(mother);

        for (Human child : childs) {
            humanList.add(child);
        }
    }

    @Override
    public Iterator<Human> iterator() {
        return new HumanIterator(humanList);
    }

    
}