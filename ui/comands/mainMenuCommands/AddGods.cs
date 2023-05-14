class AddGods : Command
{

     public AddGods(OurConsole ourConsole) : base(ourConsole){}

    public override void execute()
    {
        getConsoleFT().addGods();
    }

    public override string getDescription()
    {
        return "Добавить бога, его отца и мать";
    }
}