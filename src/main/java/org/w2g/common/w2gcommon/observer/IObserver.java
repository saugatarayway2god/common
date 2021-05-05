package org.w2g.common.w2gcommon.observer;

import org.w2g.common.w2gcommon.EventPayload;

public interface IObserver {
    public void update(EventPayload eventPayload);
}
