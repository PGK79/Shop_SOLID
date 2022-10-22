package Adviser;

import Adviser.Adviser;

public class ProductAdviser implements Adviser {

    public void printInConsole(String msg) {
        System.out.println(msg);
    }

    @Override
    public void advise(String advice) {
        printInConsole(advice);
    }
}
