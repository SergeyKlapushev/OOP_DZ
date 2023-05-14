using System;
using System.Collections.Generic;
using System.Text;

public class God
{
    private string name;
    private God father;
    private God mother;
    private List<God> children = new List<God>();

    public God(string name)
    {
        this.name = name;
        children.Clear();
    }
    public God(string name, string fatherName)
    {
        this.name = name;
        father = new God(fatherName);
        mother = null;
        children = null;
    }

    public God(string name, string fatherName, string motherName)
    {
        this.name = name;
        father = new God(fatherName);
        mother = new God(motherName);
        children.Clear();
    }

    //Get, Set name
    public void setName(string name) { this.name = name; }
    public String getName() { return $"{name}"; }


    //Get, Set father
    public void setFather(God god)
    {
        father = god;
    }
    public String getFatherName()
    {
        if (father == null)
        {
            return "Отец: Неизвестен";
        }
        else
        {
            return $"Отец: {father.getName()}";
        }
    }

    //Get, Set mother
    public void setMother(God god)
    {
        mother = god;
    }
    public String getMotherName()
    {
        if (mother == null)
        {
            return "Мать: Неизвестна";
        }
        else
        {
            return $"Мать: {mother.getName()}";
        }
    }
    public void addChildrenByName(string name)
    {
        God child = new God(name);
        children.Add(child);
    }
    public void addChildren(God child)
    {
        children.Add(child);
    }
    public String getChildrenName()
    {
        StringBuilder childsInfo = new StringBuilder();
        if (children.Count == 0)
        {
            return $"Дети: Неизвестны\n";
        }
        else
        {
            for (int i = 0; i < children.Count; i++)
            {
                childsInfo.Append($"{children[i].getName()} ");
            }
            return $"Дети: {childsInfo.ToString()}";
        }
    }
    public String getInformation()
    {
        StringBuilder info = new StringBuilder();
        info.Append($"{this.getName()}\n");
        info.Append($"{this.getFatherName()}\n");
        info.Append($"{this.getMotherName()}\n");
        info.Append($"{this.getChildrenName()}\n");
        return info.ToString();
    }
}
