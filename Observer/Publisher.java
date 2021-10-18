package com.company.Observer;

import com.company.Observer.Observer;

public interface Publisher {
    void add(Observer observer);
    void delete(Observer observer);
    void notifyObserver();
}
