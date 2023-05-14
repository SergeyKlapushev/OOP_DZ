class SetFather : Command
{
    public SetFather(OurConsole ourConsole) : base(ourConsole){}

    public override void execute()
    {
        getConsoleFT().setFather();
    }

    public override string getDescription()
    {
        return "Задать отца";
    }
}