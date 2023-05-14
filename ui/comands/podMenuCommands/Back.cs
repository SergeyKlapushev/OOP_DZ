class Back : Command
{
    public Back(OurConsole ourConsole) : base(ourConsole){}

    public override void execute()
    {
        getConsoleFT().setFather();
    }

    public override string getDescription()
    {
        return "Назад";
    }
}