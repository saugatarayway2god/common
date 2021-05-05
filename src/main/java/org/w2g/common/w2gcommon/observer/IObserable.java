package org.w2g.common.w2gcommon.observer;

import java.util.ArrayList;
import java.util.List;

import org.w2g.common.w2gcommon.EventPayload;



public abstract class IObserable {
    protected List<IObserver> observers=new ArrayList<IObserver>();
    public abstract void add(IObserver observer);
    public void remove(IObserver observer) {
        observers.remove(observer);
    }
    public void doNotify(EventPayload eventPayload) {
        for(IObserver iObserver : observers)
            iObserver.update(eventPayload);
    }
}