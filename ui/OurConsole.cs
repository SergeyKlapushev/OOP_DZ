using System.Text;
public class OurConsole : View
{
    private Presenter presenter;
    private Menu menu;
    private PodMenu podMenu;
    private bool work;
    private string choise;


    public OurConsole()
    {
        podMenu = new PodMenu(this);
        menu = new Menu(this);
        work = true;
    }

    public void print(string text)
    {
        Console.WriteLine(text);
    }

    public void setPresenter(Presenter presenter)
    {
        this.presenter = presenter;
    }

    public void start()
    {
        while (work)
        {
            showMainMenu();
        }
    }

    public void showMainMenu()
    {
        Console.WriteLine(menu.print());
        string choice = Console.ReadLine();
        menu.execute(choice);
    }

    public void showPodMenu()
    {
        Console.WriteLine(podMenu.print());
        string choice = Console.ReadLine();
        podMenu.execute(choice);
    }

    //Комманды
    public void addGod()
    {
        Console.Write("Введите имя бога: ");
        string name = Console.ReadLine();
        presenter.addGod(name);
    }

    public void addGods()
    {
        Console.Write("Введите имя бога: ");
        string name = Console.ReadLine();

        Console.Write("Введите имя его отца: ");
        string fatherName = Console.ReadLine();

        Console.Write("Введите имя его матери: ");
        string motherName = Console.ReadLine();

        presenter.addGods(name, fatherName, motherName);
    }

    public void setFather()
    {
        Console.Write("Введите имя отца бога: ");
        string name = Console.ReadLine();
        presenter.addGod(name);
    }

    public void getInfoFromFamilyTree()
    {
        presenter.getInfoFromTree();
    }

    public void finish()
    {
        work = false;
    }
}
