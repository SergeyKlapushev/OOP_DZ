abstract class Command
{
    private OurConsole consoleFT;

    public Command(OurConsole consoleFT)
    {
        this.consoleFT = consoleFT;
    }

    public OurConsole getConsoleFT()
    {
        return consoleFT;
    }

    abstract public string getDescription();

    abstract public void execute();
}