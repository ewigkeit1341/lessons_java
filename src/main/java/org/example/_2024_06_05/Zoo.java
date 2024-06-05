package org.example._2024_06_05;

import org.w3c.dom.ls.LSOutput;

//Создайте класс Zoo
//Создайте внутренний класс Monkey
//Внутри Monkey создайте класс Banana
//Создайте поле String sort = “Yellow”
//Создайте метод getSort();
//Создайте класс Test
//Создайте экземпляр Zoo
//Попробуйте распечатать сорт банана.
//Проанализируйте написанный код
public class Zoo {
    private Monkey monkey = new Monkey();
    public String getMonkey (){
        return monkey.getBanana();
    }
    public class Monkey {
        private Banana banana = new Banana();
        public String getBanana () {
            return banana.getSort();
        }
        public class Banana {
            private String sort = "Yellow";
            public String getSort() {
                return sort;
            }
        }
    }

}
