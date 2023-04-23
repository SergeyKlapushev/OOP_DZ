package ui.commands;

import ui.Console;

import ui.Command;

public class GetFamilyTree extends Command{

    public GetFamilyTree(Console console){
        super(console);
    }

    @Override
    public String getDescription() {
        return "Показать семейное древо";
    }

    @Override
    public void execute() {
        getConsole().getFamilyTree();
    }
    
}
