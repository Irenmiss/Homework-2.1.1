package Homework;

public class Main {
    public static void main(String[] args) {
        Human person1 = new Human("Максим", 1988, "Минск", "бренд-менеджер");
        Human person2 = new Human("Аня", 1993, "Москва", "методист образовательных программ");
        Human person3 = new Human("Катя", 1992, "Калининград", "продакт-менеджер");
        Human person4 = new Human("Артём", 1995, "Москва", "директор по развитию бизнеса");
        Human person5 = new Human("Владимир", 2001, "Казань", "");
        person1.introduction();
        person2.introduction();
        person3.introduction();
        person4.introduction();
        person5.introduction();
    }
}
