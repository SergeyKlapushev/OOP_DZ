class GetFamilyTreeInfo : Command
{
    public GetFamilyTreeInfo(OurConsole ourConsole) : base(ourConsole){}
    public override void execute()
    {
        getConsoleFT().getInfoFromFamilyTree();
    }

    public override string getDescription()
    {
        return "Посмотреть семейное древо;";
    }
}