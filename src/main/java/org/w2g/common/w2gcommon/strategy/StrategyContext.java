package org.w2g.common.w2gcommon.strategy;

import org.w2g.common.w2gcommon.EventPayload;

public abstract class StrategyContext {
    protected Strategy strategy;

    public void execute(EventPayload eventPayload){
         strategy.execute(eventPayload);
    }
}
