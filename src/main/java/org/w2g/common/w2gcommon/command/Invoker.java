package org.w2g.common.w2gcommon.command;

import java.util.HashMap;
import java.util.Map;

import org.w2g.common.w2gcommon.EventPayload;

public class Invoker {
	private Map<Integer, ICommand> onCommands = new HashMap<Integer, ICommand>();

	public Invoker() {

	}

	public void setCommand(int slot, ICommand command) {
		onCommands.put(slot, command);
	}

	public void executeSlot(int slot,EventPayload eventPayload) {
		ICommand iCommand = onCommands.get(slot)!=null ? onCommands.get(slot) : new NullCommand();
		iCommand.execute(eventPayload);
	}
	public void unExecuteSlot(int slot,EventPayload eventPayload) {
		ICommand iCommand = onCommands.get(slot)!=null ? onCommands.get(slot) : new NullCommand();
		iCommand.unexecute(eventPayload);
	}
}
