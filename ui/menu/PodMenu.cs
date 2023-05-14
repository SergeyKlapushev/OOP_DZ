using System.Text;

public class PodMenu
{
    private List<Command> commandListPM;

    public PodMenu(OurConsole ourConsole)
    {
        commandListPM = new List<Command>();
        commandListPM.Add(new Rename(ourConsole));
        commandListPM.Add(new SetFather(ourConsole));
        commandListPM.Add(new SetMother(ourConsole));
        commandListPM.Add(new Back(ourConsole));
    }


    public string print()
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < commandListPM.Count; i++)
        {
            sb.Append($"{i + 1}. {commandListPM[i].getDescription()}\n");
        }
        return sb.ToString();
    }

    public void execute(String choice)
    {
        commandListPM[Convert.ToInt32(choice) - 1].execute();
    }
}