package org.w2g.common.w2gcommon.command;

import org.w2g.common.w2gcommon.observer.IObserable;

public interface ObserableReceiver extends Receiver {
	public IObserable getObserable();
}
