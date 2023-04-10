import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter pepper = new FileWriter("DataFamilyTree.txt",  Charset.forName("UTF-8"));
        BufferedWriter pen = new BufferedWriter(pepper);

        Geneticist geneticist = new Geneticist();
        FamilyTree familyTree = new FamilyTree();
        Human father = new Human();
        Human mother = new Human();
        List<Human> children = new ArrayList<>();

        Human petr1 = new Human("Пётр", new Human("Александр"), new Human("Екатерина"));
        familyTree.addBranch(petr1);
        geneticist.Record(petr1, pen);

        Human alexey = new Human("Алексей", new Human("Пётр"), new Human("Елизавета"));
        familyTree.addBranch(alexey);
        geneticist.Record(alexey, pen);

        pen.close();
    }
}