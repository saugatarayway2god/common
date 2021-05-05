package org.w2g.common.w2gcommon;

public enum EventNames {

	EVENT_NEME_CHAT_REQUEST("chatRequest","chatRequestChannel");
	private String eventName;
	private String eventChannelName;
	private EventNames(String eventName,String eventChannelName){
		this.setEventName(eventName);
		this.setEventName(eventChannelName);
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventChannelName() {
		return eventChannelName;
	}
	public void setEventChannelName(String eventChannelName) {
		this.eventChannelName = eventChannelName;
	}
	
}
