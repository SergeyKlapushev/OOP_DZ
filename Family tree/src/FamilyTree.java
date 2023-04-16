import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.Iterator;

public class FamilyTree implements Iterable<Human> {
    private List<Human> humanList;

    public FamilyTree() {
        humanList = new ArrayList<>();
    }

    public FamilyTree(List<Human> humanList) {
        this.humanList = humanList;
    }

    public List<Human> getHumanList() {
        return humanList;
    }

    public void addHuman(Human human) {
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

    public void sortedByName() {
        humanList.sort(new SortHumanByName());
    }

    public void sortedByDateOfBorn(){
        humanList.sort(new SortHumanByDateOfBorn());
    }
    

    @Override
    public Iterator<Human> iterator() {
        return new HumanIterator(humanList);
    }
}