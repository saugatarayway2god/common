package org.w2g.common.w2gcommon.command;

import org.w2g.common.w2gcommon.EventPayload;

public interface Receiver {
public void action(EventPayload eventPayload);
public void revert(EventPayload eventPayload);
}
