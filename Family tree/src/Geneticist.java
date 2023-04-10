import java.io.BufferedWriter;
import java.io.IOException;

public class Geneticist implements Recording {
    
    @Override
    public void Record(Human human,  BufferedWriter pen) throws IOException{
        
        try {            
            pen.write(human.getInfo());
            
            System.out.println("Запись сделана!");
        }
        catch (IOException e) {
           
            System.out.println(e);
        }
        
    }
}

