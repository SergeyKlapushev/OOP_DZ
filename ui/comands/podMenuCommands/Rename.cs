class Rename : Command
{
    public Rename(OurConsole ourConsole) : base(ourConsole){}

    public override void execute()
    {
        getConsoleFT().setFather();
    }

    public override string getDescription()
    {
        return "Задать отца";
    }
}