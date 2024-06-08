package org.example.subject;

import java.time.LocalTime;

public class Dollar extends Subject{
    private double value;
    private LocalTime time;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
        this.time = LocalTime.now();
        notifyObservers();
    }

    public LocalTime getTime() {
        return time;
    }

}
