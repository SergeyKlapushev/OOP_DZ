import java.util.ArrayList;
import java.util.List;

import java.util.Iterator;

public class FamilyTree<H extends Human> implements Iterable<H>{
    private List<H> humanList;

    public FamilyTree() {
        humanList = 
        new ArrayList<>();
    }

    public FamilyTree(List<H> humanList) {
        this.humanList = humanList;
    }

    public List<H> getHumanList() {
        return humanList;
    }

    public void addHuman(H human) {
        humanList.add(human);
    }

    public void addBranch(H human, H father, H mother) {
        humanList.add(human);
        humanList.add(father);
        humanList.add(mother);
    }

    public void addBranch(H human, H father, H mother, List<H> childs) {
        humanList.add(human);
        humanList.add(father);
        humanList.add(mother);

        for (H child : childs) {
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
    public Iterator<H> iterator() {
        return new HumanIterator(humanList);
    }
}