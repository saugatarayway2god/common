package org.w2g.common.w2gcommon.command;

import org.w2g.common.w2gcommon.EventPayload;

public class EventCommand implements ICommand {
    private Receiver receiver;

    public EventCommand(Receiver receiver) {
        this.receiver = receiver;
    }
    @Override
    public void execute(EventPayload eventPayload) {
        receiver.action(eventPayload);
    }

    @Override
    public void unexecute(EventPayload eventPayload) {
        receiver.revert(eventPayload);
    }

    public Receiver getReceiver() {
        return receiver;
    }
}