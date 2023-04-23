package familyTree.sortHumans;

import java.util.Comparator;

import familyTree.human.Human;

public class SortHumanByName<H> implements Comparator<Human> {

    @Override
    public int compare(Human o1, Human o2) {
        return o1.getName().compareTo(o2.getName());
    }
}