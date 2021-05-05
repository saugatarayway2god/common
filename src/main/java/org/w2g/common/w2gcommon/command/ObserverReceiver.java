package org.w2g.common.w2gcommon.command;

import org.w2g.common.w2gcommon.observer.IObserver;

public interface ObserverReceiver extends Receiver{
	public IObserver getObserver();
}
