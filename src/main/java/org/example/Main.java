package org.example;

import org.example.observers.Newspaper;
import org.example.observers.Observer;
import org.example.observers.Website;
import org.example.subject.Dollar;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Dollar dollar = new Dollar();
        Observer news = new Newspaper("New York News");
        Observer site = new Website("Amazing News");

        dollar.registerObserver(news);
        dollar.registerObserver(site);
        dollar.setValue(4.14);

        dollar.unregisterObserver(site);
        Thread.sleep(3000);
        System.out.println("///");
        dollar.setValue(4.18);



    }
}