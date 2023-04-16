public class Service {
    private FamilyTree tree;

    public Service(FamilyTree tree) {
        this.tree = tree;
    }

    public void addHuman(String name) {
        tree.addHuman(new Human());
    }

    public void sortByName() {
        tree.sortedByName();
    }

    public void sortByDateBorn() {
        tree.sortedByDateOfBorn();
    }
}
