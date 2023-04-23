package familyTree.humanIterator;

import java.util.Iterator;
import java.util.List;

public class HumanIterator<H> implements Iterator<H> {
    private int index;
    private List<H> humanList;

    public HumanIterator(List<H> humanList){
        this.humanList = humanList;
    }

    @Override
    public boolean hasNext() {
        return index < humanList.size();
    }

    public H next() {
        return humanList.get(index++);
    }
}
