class  Finish: Command
{
     public Finish(OurConsole ourConsole) : base(ourConsole){}


    public override void execute()
    {
        getConsoleFT().finish();
    }

    public override string getDescription()
    {
        return "Завершить работу;";
    }
}