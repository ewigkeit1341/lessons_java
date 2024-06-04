package org.example._2024_05_23;

public class Main {
    public static void main(String[] args) {
//        House myHouse = new House();
//        System.out.println(myHouse.getFloor() + " " + myHouse.getRooms() + " " + myHouse.getAddress());
//        myHouse.setFloor(3);
//        myHouse.setRooms(5);
//        myHouse.setAddress("Some address");
//        System.out.println(myHouse.getFloor() + " " + myHouse.getRooms() + " " + myHouse.getAddress());
        House myHouse = new House(3, 5, "Address");
        System.out.println(myHouse.getFloor() + " " + myHouse.getRooms() + " " + myHouse.getAddress());
        myHouse.setFloor(-100);
        System.out.println(myHouse.getFloor() + " " + myHouse.getRooms() + " " + myHouse.getAddress());


        Student myStudent = new Student("Vasya", 20, "middle");
        System.out.println(myStudent.getName() + " " + myStudent.getAge() + " " + myStudent.getEducation());

        Cat mCat = new Cat("Matrosskin", 12, "Black");
        System.out.println(mCat.getName() + " " + mCat.getAge() + " " + mCat.getColor());


//        System.out.println(getReturnSum(4, 44));
//    }
//    }

    }

}
