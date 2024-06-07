package org.example._2024_06_06;

public class StudentMain {
    public static void main(String[] args) {
        Student ivan = new Student();
        ivan.setName("Иван");
        ivan.setAge(30);
        ivan.setGroup("260324_morning");
        Student ilya = new Student();
        ilya.setName("Илья");
        ilya.setAge(30);
        ilya.setGroup("260324_morning");
        Student mariya = new Student("Мария", 18, "260324_morning");
        System.out.println(ivan);
        System.out.println(ilya);
        System.out.println(mariya);
    }
}