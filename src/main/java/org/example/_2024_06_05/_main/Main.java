package org.example._2024_06_05._main;

import org.example._2024_06_05._test.SubTest;

//Создайте пакет main
//Создайте класс Main и метод main
//Создайте новый пакет tasks
//Создайте класс Test
//Создайте переменную с модификатором public
//Создайте внутри пакета task подпакет sub_task
//Создайте в пакете sub_task класс SubTest
//Создайте переменную с модификатором private
//Создайте экземпляры классов Test и SubTest в классе Main
//Попробуйте изменить модификаторы классов и переменных
//Проанализируйте написанный код
public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        SubTest subtest = new SubTest();
//        System.out.println(test.getTask());
//        System.out.println(subtest.getSubTask());
        test.setTask(100);
        System.out.println(test.getTask());
    }
}