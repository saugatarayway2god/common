package org.w2g.common.w2gcommon.observer;

import org.w2g.common.w2gcommon.command.ICommand;

public interface IWebsocketObserver {
	public void update(ICommand iCommand);
}
