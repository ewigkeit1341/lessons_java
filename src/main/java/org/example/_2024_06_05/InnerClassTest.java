package org.example._2024_06_05;

class InnerClassTest {
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }


    //inner class

    //    inner class
    class InnerClass {
        int innerNum;

        public int getInnerNum() {
            return innerNum;
        }

        public void setInnerNum(int innerNum) {
            this.innerNum = innerNum;
        }

        //    inner static class
        static class InnerStaticClass {
            int innerNum;

            public int getInnerNum() {
                return innerNum;
            }

            public void setInnerNum(int innerNum) {
                this.innerNum = innerNum;
            }
        }

    }
}
