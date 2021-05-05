package org.w2g.common.w2gcommon;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by JsIdentity on 10/11/2017.
 * STEPS TO CONVERT userId & userto LONG TO STRING
 * 1. Modified getters and Setters of EventPayload 
 * 2. Modified /ProjectOne/src/main/java/org/w2g/common/w2gcommon/User.java
 * 3. Modified string adminUserId=chatRoom.split("_")[1];
 * 4. Modified com.example.general.generalconsumerv2.chat.ComsumerController.subscribeChatMessages_spring5(String, String)
 */


@JsonInclude(JsonInclude.Include.NON_NULL)
public class EventPayload {

    @JsonProperty("event_name")
    String eventName;
    @JsonProperty("time")
    long time;
    //@JsonProperty("time")
    //LocalDateTime time;
    @JsonProperty("id")
    int id;
    @JsonProperty("user_id")
    String userId;
    @JsonProperty("user_to")
    String userTo;
    @JsonProperty("actual_user_id")
    String actualUserId;    
    @JsonProperty("user_name")
    String userName;
    @JsonProperty("disConnected")
    boolean disConnected;
    boolean heartBeat;
    @JsonProperty("consumer_to_general_channel_name")
    String consumerToGeneralChannelName;
    @JsonProperty("heartBeatNumber")
    int heartBeatNumber;
    @JsonProperty("reply")
    String reply;
    @JsonProperty("thumbDownloadUrl")
    String thumbDownloadUrl;
    @JsonProperty("messagepayload")
    MessagePayload messagePayload;
    public EventPayload(String eventName){
    	this.eventName=eventName;
    }
    public EventPayload(){}



public EventPayload(EventPayload eventPayload) {
super();
this.id = eventPayload.getId();
this.eventName = eventPayload.eventName;
this.userId = eventPayload.userId;
this.userTo = eventPayload.userTo;
this.actualUserId = eventPayload.actualUserId;
this.userName = eventPayload.userName;
this.disConnected = eventPayload.disConnected;
this.heartBeat = eventPayload.heartBeat;
this.consumerToGeneralChannelName = eventPayload.consumerToGeneralChannelName;
this.heartBeatNumber = eventPayload.heartBeatNumber;
this.thumbDownloadUrl = eventPayload.thumbDownloadUrl;
}




@Override
public String toString() {
	return "EventPayload [eventName=" + eventName + ", time=" + time + ", id=" + id + ", userId=" + userId + ", userTo="
			+ userTo + ", actualUserId=" + actualUserId + ", userName=" + userName + ", disConnected=" + disConnected
			+ ", heartBeat=" + heartBeat + ", consumerToGeneralChannelName=" + consumerToGeneralChannelName
			+ ", heartBeatNumber=" + heartBeatNumber + ", reply=" + reply + ", thumbDownloadUrl=" + thumbDownloadUrl
			+ ", messagePayload=" + messagePayload + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public long getTime() {
	return time;
}
public void setTime(long time) {
	this.time = time;
}
public int getHeartBeatNumber() {
return heartBeatNumber;
}
public void setHeartBeatNumber(int heartBeatNumber) {
this.heartBeatNumber = heartBeatNumber;
}
public String getEventName() {
return eventName;
}

public void setEventName(String eventName) {
this.eventName = eventName;
}

public String getUserId() {
return userId;
}
public void setUserId(String userId) {
this.userId = userId;
}
public String getUserTo() {
return userTo;
}
public void setUserTo(String userTo) {
this.userTo = userTo;
}

public String getActualUserId() {
return actualUserId;
}
public void setActualUserId(String actualUserId) {
this.actualUserId = actualUserId;
}
public String getUserName() {
return userName;
}

public void setUserName(String userName) {
this.userName = userName;
}

public boolean isDisConnected() {
return disConnected;
}
public void setDisConnected(boolean disConnected) {
this.disConnected = disConnected;
}
public String getConsumerToGeneralChannelName() {
return consumerToGeneralChannelName;
}
public void setConsumerToGeneralChannelName(String consumerToGeneralChannelName) {
this.consumerToGeneralChannelName = consumerToGeneralChannelName;
}
public MessagePayload getMessagePayload() {
return messagePayload;
}

public void setMessagePayload(MessagePayload messagePayload) {
this.messagePayload = messagePayload;
}
public boolean isHeartBeat() {
return heartBeat;
}
public void setHeartBeat(boolean heartBeat) {
this.heartBeat = heartBeat;
}
public String getThumbDownloadUrl() {
	return thumbDownloadUrl;
}
public void setThumbDownloadUrl(String thumbDownloadUrl) {
	this.thumbDownloadUrl = thumbDownloadUrl;
}
public String getReply() {
	return reply;
}
public void setReply(String reply) {
	this.reply = reply;
}



}

