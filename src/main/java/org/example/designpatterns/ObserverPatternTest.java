package org.example.designpatterns;

import java.util.ArrayList;
import java.util.List;

interface Subject {
    void register(Observer obj);
    void unregister(Observer obj);
    void notifyObservers();
}

class DeliveryData implements Subject {

    private List<Observer> observers;
    private String location;

    public DeliveryData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        for(Observer obj : observers) {
            obj.update(location);
        }
    }

    public void locationChanged() {
        this.location = getLocation();
        notifyObservers();
    }

    public String getLocation() {
        return "YPlace";
    }
}


interface Observer {
    public void update(String location);
}


class Seller implements Observer {
    private String location;

    @Override
    public void update(String location) {
        this.location = location;
        showLocation();
    }

    public void showLocation() {
        System.out.println("Notification at Seller - Current Location: " + location);
    }
}


class ObserverPatternTest {

    public static void main(String[] args) {
        DeliveryData topic = new DeliveryData();

        Observer obj1 = new Seller();
        topic.register(obj1);
        topic.locationChanged();
        System.out.println();
        topic.locationChanged();

    }
}