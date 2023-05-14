class AddGod : Command
{

    public AddGod(OurConsole ourConsole) : base(ourConsole){}


    public override void execute()
    {
        getConsoleFT().addGod();
    }

    public override string getDescription()
    {
        return "Добавить бога в семейное древо;";
    }
}