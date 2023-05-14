using System.Text;

public class Menu
{
    private List<Command> commandList;


    public Menu(OurConsole ourConsole)
    {
        commandList = new List<Command>();
        commandList.Add(new AddGod(ourConsole));
        commandList.Add(new AddGods(ourConsole));
        commandList.Add(new GetFamilyTreeInfo(ourConsole));
        commandList.Add(new Finish(ourConsole));
    }

    public string print()
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < commandList.Count; i++)
        {
            sb.Append($"{i + 1}. {commandList[i].getDescription()}\n");
        }
        return sb.ToString();
    }

    public void execute(String choice)
    {
        commandList[Convert.ToInt32(choice) - 1].execute();
    }
}