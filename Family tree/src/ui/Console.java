package ui;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

import familyTree.FamilyTree;
import familyTree.human.Human;
import presenter.Presenter;

public class Console implements View {

    private FamilyTree<Human> familyTree;
    private Presenter presenter;
    private Scanner scanner;
    private boolean work;
    private Menu menu;

    public Console() {
        scanner = new Scanner(System.in, "UTF-8");
        work = true;
        menu = new Menu(this);
        familyTree = new FamilyTree<>();

    }

    @Override
    public void showCommands(String text) {
        System.out.println(text);
    }

    @Override
    public void start() {
        while (work) {
            System.out.println(menu.print());
            String choice = scanner.nextLine();
            if (check(choice)) {
                menu.execute(Integer.parseInt(choice));
            }
        }
    }

    private boolean check(String text) {
        return text.matches("[1-9]+") && Integer.parseInt(text) <= menu.getSize() && Integer.parseInt(text) > 0;
    }

    public void fail() {
        System.out.println("Неверный ввод");
    }

    public void addHuman() {

        System.out.println("Введите имя человека:");
        String name = scanner.nextLine();

        System.out.println("Введите год рождения:");
        int year = Integer.parseInt(scanner.nextLine());
         
        System.out.println("Введите месяц рождения:");
        int month = Integer.parseInt(scanner.nextLine());
          
        System.out.println("Введите день рождения:");
        int day = Integer.parseInt(scanner.nextLine());
         
        System.out.println("Введите имя отца:");
        String fatherName = scanner.nextLine();
         
        System.out.println("Введите имя матери:");
        String motherName = scanner.nextLine();
        
        Human father = new Human(fatherName);
        Human mother = new Human(motherName);
         
        Human human = new Human(name, year, month, day, father, mother);
        familyTree.addHuman(human);
    }

    public void getFamilyTree() {
        if(familyTree.getHumanList().isEmpty()){
            System.out.println("\nВ семейном древе нет записей. Сначала выберите 'Добавить человека'\n ");
        }
        else{System.out.println(familyTree.getHumanList());}

    }

    public void finish() {
        work = false;
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

}
