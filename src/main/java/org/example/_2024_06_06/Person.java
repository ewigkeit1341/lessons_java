package org.example._2024_06_06;
//Создайте класс Person
//Определите свойство класса name с модификатором private
//Определите конструктор с параметром name
//Переопределите toString(), таким образом, чтобы выводилось “Name is …”
//Переопределите hashCode(), таким образом, чтобы hashCode всегда был равен 10
//Переопределите equals(), таким образом, чтобы сравнение было только с входящим объектом

public class Person {
    private String name;
    public Person(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return " Name is  " + name;
    } // преобразование объекта в строку

    @Override
    public int hashCode() {
        return 10;
    } // возвращает адрес в памяти (хэшкод)

    @Override
    public boolean equals(Object obj) {
        return this==obj;
    } // сравнение

}