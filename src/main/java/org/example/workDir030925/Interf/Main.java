package org.example.workDir030925.Interf;





class Sol0309 implements A {

    public void bCall() {
        A.super.reset();
    }
}

public class Main {
    public static void main(String[] args) {

        Sol0309 aclass = new Sol0309();
        aclass.reset();
        aclass.bCall();

    }
}
