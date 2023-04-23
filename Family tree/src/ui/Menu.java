package ui;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import ui.commands.AddHuman;
import ui.commands.Finish;
import ui.commands.GetFamilyTree;

public class Menu {
    List<Command> menu;

    public Menu (Console console){
        menu = new ArrayList<>();
        menu.add(new AddHuman(console));
        menu.add(new GetFamilyTree(console));
        menu.add(new Finish(console));
    }


    public String print(){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < menu.size(); i++) {
            sb.append(i+1 + ". " + menu.get(i).getDescription()+"\n");
        }
        return sb.toString();
    }

    public int getSize(){
        return menu.size();
    }

    void execute(int choice){
        menu.get(choice-1).execute();
    }
}
