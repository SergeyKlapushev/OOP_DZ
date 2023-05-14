class SetMother : Command
{
    public SetMother(OurConsole ourConsole) : base(ourConsole){}

    public override void execute()
    {
        getConsoleFT().setFather();
    }

    public override string getDescription()
    {
        return "Задать мать";
    }
}