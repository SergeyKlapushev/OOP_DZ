public class Presenter
{
    private View view;
    private FamilyTree tree;

    public Presenter(View mainManu, FamilyTree famileTree){
        this.view = mainManu;
        this.tree = famileTree;
        view.setPresenter(this);        
    }

    public void addGod(String name){
        string answer = tree.addGod(new God(name));
        view.print($"{answer}");
    }

    public void addGods(String name, String fName, String mName){
        string answer = tree.addGods(new God(name), new God(fName), new God(mName));
        view.print($"{answer}");
    }


    public void getInfoFromTree(){
        string answer = tree.getInfoAllTree();
        view.print(answer);
    }
}