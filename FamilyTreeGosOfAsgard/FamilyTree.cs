using System.Collections;
using System.Text;

public class FamilyTree : IEnumerable<God>
{
    private List<God> godList;

    public FamilyTree()
    {
        godList = new List<God>();
    }

    public List<God> getGodList()
    {
        return godList;
    }

    //Получить информацию о боге по его имени
    public String FindGodByName(string name)
    {

        StringBuilder infoByGod = new StringBuilder();
        for (int i = 0; i < godList.Count; i++)
        {
            if (godList[i].getName() == name)
            {
                infoByGod.Append(godList[i].getName() + "\n");
                infoByGod.Append(godList[i].getFatherName() + "\n");
                infoByGod.Append(godList[i].getMotherName() + "\n");
                infoByGod.Append(godList[i].getChildrenName() + "\n");
                return infoByGod.ToString();
            }
        }
        return $"Такого Бога нет в пантеоне\n";
    }

    //Получить бога по его имени
    public God getGodByName(string name)
    {

        for (int i = 0; i < godList.Count; i++)
        {
            if (godList[i].getName() == name)
            {
                return godList[i];
            }
        }
        return null;
    }
    public String addGod(God god)
    {
        if (god.getName().Equals("") || god.getName().Equals(null))
        {
            return $"\nИмя не может быть пустым \n";
        }

        if (Availability(god) == false)
        {
            godList.Add(god);
            return $"\nБог добавлен\n";
        }
        else
        {
            return $"{god.getName()} уже записан в древо";
        }


    }
    public String addGods(God god, God father)
    {
        godList.Add(god);
        godList.Add(father);
        god.setFather(father);
        father.addChildren(god);
        return "\nБоги добавлены\n";
    }

    public String addGods(God god, God father, God mother)
    {
        if (!godList.Contains(father))
        {
            godList.Add(father);
        }

        if (!godList.Contains(mother))
        {
            godList.Add(mother);
        }
        if (!godList.Contains(god))
        {
            godList.Add(god);
        }

        god.setFather(father);
        god.setMother(mother);
        father.addChildren(god);
        mother.addChildren(god);
        return $"\nБоги добавлены\n";
        
    }

    public String getInfoAllTree()
    {
        StringBuilder info = new StringBuilder();
        for (int i = 0; i < godList.Count; i++)
        {
            info.Append($"\n{godList[i].getName()}\n");
            info.Append($"{godList[i].getFatherName()}\n");
            info.Append($"{godList[i].getMotherName()}\n");
            info.Append($"{godList[i].getChildrenName()}\n");

        }
        if (info.Equals(""))
        {
            return $"\nДрево не содержит информации\n";
        }
        return info.ToString();
    }

    public bool Availability(God god)
    {

        for (int i = 0; i < godList.Count; i++)
        {
            if (godList[i].getName().Equals(god.getName()))
            {
                return true;
            }
        }
        return false;

    }


    public IEnumerator<God> GetEnumerator()
    {
        return ((IEnumerable<God>)godList).GetEnumerator();
    }

    IEnumerator IEnumerable.GetEnumerator()
    {
        return ((IEnumerable)godList).GetEnumerator();
    }

    public void Sortering()
    {
        godList.Sort();
    }
}