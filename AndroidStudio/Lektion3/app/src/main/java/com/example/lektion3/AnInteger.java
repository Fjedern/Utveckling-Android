package com.example.lektion3;

import java.io.Serializable;

public class AnInteger implements Serializable {
    int i;

    public AnInteger(int a) {
        i = a;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
