package org.example.observers;

import org.example.subject.Dollar;
import org.example.subject.Subject;

public class Newspaper implements Observer{
    private String name;

    public Newspaper(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject s) {
        Dollar dollar = (Dollar) s;
        System.out.println(name + " informs the value of the dollar: R$" +
                dollar.getValue() + " at " + dollar.getTime());
    }
}
