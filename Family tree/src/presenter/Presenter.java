package presenter;

import java.util.List;

import javax.swing.text.View;

import familyTree.FamilyTree;

public class Presenter<H> {
    
    View view;
    FamilyTree familyTree;

    public Presenter(){
        this.view = view;
        this.familyTree = familyTree;
    }

    public List<H> getFamilyTree(){
        return familyTree.getHumanList();
    }
}
