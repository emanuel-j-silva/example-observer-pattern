package org.example.observers;

import org.example.subject.Dollar;
import org.example.subject.Subject;

public class Website implements Observer{
    private String url;

    public Website(String url) {
        this.url = url;
    }

    @Override
    public void update(Subject s) {
        Dollar dollar = (Dollar) s;
        System.out.println(url + " informs the value of the dollar: R$" +
                dollar.getValue() + " at " + dollar.getTime());
    }
}
