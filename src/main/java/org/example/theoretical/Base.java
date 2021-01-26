package org.example.theoretical;

public class Base {

    static int field;

    public Base(){
        doMath(1);
    }

    void doMath(int number){
        field += number;
    }

    static class Extension extends Base {

        public Extension(){
            doMath(2);
        }

        void doMath(int number) {
            field += number * 2;
        }
    }

    public static void main(String[] args) {
        Base base = new Extension();
        base.doMath(2);
    }
}
