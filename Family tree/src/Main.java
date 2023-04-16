import java.util.PrimitiveIterator.OfLong;

public class Main {

    public static void main(String[] args) {

        FamilyTree familyTree = new FamilyTree();
        Service service = new Service(familyTree);

        Human petr1 = new Human("Пётр", 1672, 6, 9, new Human("Александр"), new Human("Екатерина"));
        familyTree.addHuman(petr1);

        Human alexey = new Human("Алексей", 1693, 5, 4, new Human("Пётр"), new Human("Елизавета"));
        familyTree.addHuman(alexey);

        Human gleb = new Human("Глеб", 1712, 2, 25, new Human("Алексей"), new Human("Кристина"));
        familyTree.addHuman(gleb);

        Human oleg = new Human("Олег", 1743, 12, 10, new Human("Иван"), new Human("Елена"));
        familyTree.addHuman(oleg);

        Human vasili = new Human("Василий", 2020, 6, 3, new Human("Сергей"), new Human("Вероника"));
        familyTree.addHuman(vasili);

        // Сортировка по имени
        service.sortByName();
        System.out.println(familyTree.getHumanList());

        //Сортировка по дате рождения (От младшего к старшему)
        service.sortByDateBorn();
        System.out.println(familyTree.getHumanList());

    }
}