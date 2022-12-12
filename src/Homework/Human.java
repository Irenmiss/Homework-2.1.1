package Homework;

public class Human {
    public int yearOfBirth;
    public String name;
    public String town;
    public String jobTitle;

    Human(String name, int yearOfBirth, String town, String jobTitle) {
        if (name.isEmpty() || name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        if (town.isEmpty() || name == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (jobTitle.isEmpty() || name == null) {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }
    }

    void introduction() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился/ась в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }

    @Override
    public String toString() {
        return "Human{" +
                "yearOfBirth=" + yearOfBirth +
                ", name='" + name + '\'' +
                ", town='" + town + '\'' +
                '}';
    }
}
