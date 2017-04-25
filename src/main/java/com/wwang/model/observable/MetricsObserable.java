package com.wwang.model.observable;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

/**
 * 定义一个Observable
 * @author Administrator
 *
 */
public class MetricsObserable extends Observable {
    private Map<String, Long> counterMap = new HashMap<>();
    public void updateCounter(String key, Long value) {
        counterMap.put(key, value);
        setChanged();
        notifyObservers(counterMap);
    }
}
