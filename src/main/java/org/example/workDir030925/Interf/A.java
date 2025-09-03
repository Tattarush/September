package org.example.workDir030925.Interf;

interface A extends B {
    default void reset() {
        System.out.println("A");
    }

}
