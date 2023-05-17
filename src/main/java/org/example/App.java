package org.example;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Tester one = new Tester();
        one.name = "Alex";
        one.surname = "light";
        one.experienceInYears = 4;
        one.englishLevel = "C1";
        one.salary = 456.5;
        one.takeSalary();
        one.takeSalary(one.salary, one.englishLevel);
        System.out.println(one.takeSalary(one.salary, one.experienceInYears));

        Tester two = new Tester("Jake", "Lightwood;", "A2", 6, 786.9);

        int expComp = Tester.compareExperience(one, two);
        if (expComp > 0)
        {
            System.out.println(one.getName() + " больше опыта работы, чем у " + two.getName());
        }
        else if (expComp < 0)
        {
            System.out.println(two.getName() + " больше опыта работы, чем у " + one.getName());
        }
        else
        {
            System.out.println(one.getName() + " и " + two.getName() + " равны по опыту работы!");
        }
    }
}
