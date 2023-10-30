package Homework2;

public class Project {
    public static void main(String[] args) {
        int programmer = 5;
        int tester = 2;
        int support = 1;
        int testerOnProject = programmer * tester;
        int supportOnProject = support * programmer;
        int allProjectSpecialists = programmer + testerOnProject + supportOnProject;
        System.out.println(programmer + " программистов необходимо для проекта");
        System.out.println(testerOnProject + " тестировщиков необходимо для проекта");
        System.out.println(supportOnProject + " специалистов поддержки необходимо для проекта");
        System.out.println(allProjectSpecialists + " специалистов всего работают над проектом");
    }
}