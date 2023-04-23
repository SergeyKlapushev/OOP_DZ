package familyTree.sortHumans;


import java.util.Comparator;

import familyTree.human.Human;

public class SortHumanByDateOfBorn<H> implements Comparator<Human>{

    @Override
    public int compare(Human o1, Human o2) {
        return -o1.getBithDay().compareTo(o2.getBithDay());
    }
}