package com.deep.design_patterns.observer;

/**
 * Created by deepanshu.saxena on 03/06/16.
 */

public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
