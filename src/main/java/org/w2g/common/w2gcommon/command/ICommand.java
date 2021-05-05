package org.w2g.common.w2gcommon.command;

import org.w2g.common.w2gcommon.EventPayload;

public interface ICommand {
public void execute(EventPayload eventPayload);
public void unexecute(EventPayload eventPayload);
}
