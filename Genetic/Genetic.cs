using System.IO;
public interface IRecord<God>
{
    public void record(God god);
}

public interface IRead
{
    public void read();
}

class Genetic : IRecord<God>, IRead
{ 
    public void record(God god)
    {
        try
        {
            StreamWriter sw = new StreamWriter("Chronicles.txt", append: true);
            sw.WriteAsync(god.getInformation());
            sw.Close();

        }
        catch (Exception e)
        {
            Console.WriteLine("Не удалось сделать запись");
        }
    }

    public void read(){
        try
        {
            string line;
            StreamReader sr = new StreamReader("Chronicles.txt");
            while ((line = sr.ReadLine()) != null)
                {
                    Console.WriteLine(line);
                }
            sr.Close();
        }

        catch (Exception e)
        {
            Console.WriteLine("В хрониках не сущесвует записы о нём");
        }
    }
}