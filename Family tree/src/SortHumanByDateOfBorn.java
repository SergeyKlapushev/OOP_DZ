import java.util.Comparator;

public class SortHumanByDateOfBorn implements Comparator<Human>{

    @Override
    public int compare(Human o1, Human o2) {
        return -o1.getBithDay().compareTo(o2.getBithDay());
    }
}