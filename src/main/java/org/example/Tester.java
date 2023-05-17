package org.example;

public class Tester {
    String name;
    String surname;
    int experienceInYears;
    String englishLevel;
    double salary;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }

    public String getEnglishLevel() {
        return englishLevel;
    }

    public double getSalary() {
        return salary;
    }
    public Tester() //1 конструктор
    {

    }

    public Tester(String name, String surname, String englishLevel) //2 конструктор
    {
        this.name = name;
        this.surname = surname;
        this.englishLevel = englishLevel;
    }

    //3 конструктор
    public Tester(String name, String surname, String englishLevel, int experienceInYears, double salary)
    {
        this(name, surname, englishLevel);
        this.experienceInYears = experienceInYears;
        this.salary = salary;
    }

    public void takeSalary() //перегруз титпа просто зарплата
    {
        System.out.println(salary);
    }

    public double takeSalary(double salary, int experienceInYears) //перегруз типа премия
    {
        return salary * experienceInYears / 2;
    }

    public void takeSalary(double salary, String englishLevel) //перегруз типа исходя из ур англа надбавка
    {
        if (englishLevel == "A1" || englishLevel == "A2") {
            System.out.println(salary);
        }
        if (englishLevel == "B1" || englishLevel == "B2") {
            System.out.println(salary + 150);
        }
        if (englishLevel == "C1" || englishLevel == "C2") {
            System.out.println(salary + 550);
        }
    }

    public static int compareExperience(Tester tester1, Tester tester2)
    {
        return Integer.compare(tester1.experienceInYears, tester2.experienceInYears);
    }

}
