import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Human implements Serializable, Comparable<Human> {
    private String name;
    private LocalDate birhtDay;
    private Human father;
    private Human mother;
    private List<Human> children;

    public Human(String name, Human father, Human mother) {
        this.name = name;
        this.father = father;
        this.mother = mother;
    }

    public Human(String name, int yearBorn, int monthBirn, int dayBorn, Human father, Human mother) {
        this.name = name;
        this.birhtDay = LocalDate.of(yearBorn, monthBirn, dayBorn);
        this.father = father;
        this.mother = mother;
    }

    public Human(String name) {
        this.name = name;
    }

    public Human() {
    }

    public String setName(String name) {
        return this.name = name;
    }

    public List<Human> addName(Human child) {
        children.add(child);
        return children;
    }

    public String getName() {
        return this.name;
    }

    public String getFatherName() {
        return this.father.name;
    }

    public LocalDate getBithDay() {
        return this.birhtDay;
    }

    @Override
    public String toString() {
        return "\n--------------------\n" + name + "\nродился:" + birhtDay + "\n Отец - " + father.getName()
                + "\n Мать - "
                + mother.getName()
                +"\n--------------------";
    }


    @Override
    public int compareTo(Human o){
       try{
        return -this.birhtDay.compareTo(o.birhtDay);
       }
       catch(Exception e){
        System.out.println("Не ввели дату рождения!");
       }
    return 0;
    }
}