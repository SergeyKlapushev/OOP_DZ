package genetic;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Geneticist<H> implements Recording<H>, Readable<H> {

    @Override
    public void record(H human) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("DataFamilyTree.bin"));
            oos.writeObject(human);
            oos.close();
        } catch (Exception e) {
            System.out.println("Не удаётся сделать запись!:(");
        }

    }

    @Override
    public void read(H human){
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DataFamilyTree.bin"));
            H hum = (H) ois.readObject();
            System.out.println(hum);
            ois.close();

        } catch (IOException e) {
            System.out.println("Не удаётся считать :(");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
