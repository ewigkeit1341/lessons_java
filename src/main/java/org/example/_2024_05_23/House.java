package org.example._2024_05_23;

public class House {
    private int floor;
    private int rooms;
    private String address;

    public House() {}

    public House(int floor, int rooms, String address) {
        this.floor = floor;
        this.rooms = rooms;
        this.address = address;
    }

    // Геттеры - возвращают значение
    public int getFloor() {
        return this.floor;
    }

    public int getRooms() {
        return this.rooms;
    }

    public String getAddress() {
        return this.address;
    }


    // Сеттеры - назначают, присваивают значение

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}

// Типы обращений к переменным
//private => private int название переменной
//public => public int название переменной
//default =>  int название переменной
//protected => protected int название переменной
//              => super.floor (обращение к защищенной переменной)

