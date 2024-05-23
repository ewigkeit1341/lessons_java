package org.example._2024_05_22;

public class Test {
    public static void main(String[] args) {
        Kot kot = new Kot();
        System.out.println(kot.name + " " + kot.color + " " + kot.weight);

//        System.out.println(kot.name + " " + kot.color + " " + kot.weight);

        Kot matrosskin = new Kot("Matrosskin", "black", 30);
        System.out.println(matrosskin.name + " " + matrosskin.color + " " + matrosskin.weight);
    }

}
