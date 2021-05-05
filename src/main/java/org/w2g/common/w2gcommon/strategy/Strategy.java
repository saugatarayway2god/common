package org.w2g.common.w2gcommon.strategy;

import org.w2g.common.w2gcommon.EventPayload;

public interface Strategy {
    public void execute(EventPayload eventPayload);
}
