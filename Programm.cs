using System;


class Programm
{
    public static void Main(String[] args)
    {
        View view = new OurConsole();
        FamilyTree familyTree = new FamilyTree();
        Presenter presenter = new Presenter(view, familyTree);
        view.start();
    }
}
