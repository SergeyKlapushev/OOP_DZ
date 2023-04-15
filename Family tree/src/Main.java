import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        FamilyTree familyTree = new FamilyTree();

        Human petr1 = new Human("Пётр", new Human("Александр"), new Human("Екатерина"));
        familyTree.addBranch(petr1);
        
        Human alexey = new Human("Алексей", new Human("Пётр"), new Human("Елизавета"));
        familyTree.addBranch(alexey);

        
        Human gleb = new Human("Глеб", new Human("Алексей"), new Human("Кристина"));
        familyTree.addBranch(gleb);

        Human oleg = new Human("Олег", new Human("Иван"), new Human("Елена"));
        familyTree.addBranch(oleg);
        
        Iterator<Human> iterator = familyTree.iterator();
        
        while(iterator.hasNext()){
            Human human = iterator.next();
            System.out.println(human);
        }
    } 
}