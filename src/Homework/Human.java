package Homework;

import java.util.Objects;

public class Human {
    private int yearOfBirth;
    public String name;
    private String town;
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

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getTown() {
        return town;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth == 0 || yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    public void setTown(String town) {
        if (town.isEmpty() || town == null || town.isBlank()) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "yearOfBirth=" + yearOfBirth +
                ", name='" + name + '\'' +
                ", town='" + town + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return yearOfBirth == human.yearOfBirth && Objects.equals(name, human.name) && Objects.equals(town, human.town) && Objects.equals(jobTitle, human.jobTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearOfBirth, name, town, jobTitle);
    }
}
