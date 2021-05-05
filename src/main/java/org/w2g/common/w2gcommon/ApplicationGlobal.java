package org.w2g.common.w2gcommon;


public class ApplicationGlobal {
 public static final String CHAT_ROOM = "CHATROOM_";
 public static final String SUBSCRIBLE_CHANNEL = "subscribleChannel_";
 public static final String CONSUMER_CHANNEL = "consumer";
 public static final String SHOW_ME_ONLINE_CHANNEL = "showMeOnlineChannel";
 public static final String SHOW_ME_ONLINE_GC_CHANNEL = "showMeOnlineGCChannel";
 public static final String TEXT_TYPE_EVENT_CHANNEL = "textTypeEventChannel";
 public static final String WS_CREATED_EVENT_FOR_GC = "wsCreatedEventForGC";
 public static final String CREATE_CHAT_ROOM_REQUEST = "createChatRoomRequest";
 public static final String CHAT_REQUEST_CHANNEL = "chatRequestChannel";
 public static final String  MESSAGE_TYPE_CHATREQUESTACCEPTED="chatRequestAccepted";
 public static final String  MESSAGE_TYPE_CHATREQUESTENDED="chatRequestEnded";
 public static final String CHAT_GENERAL_CONSUMER_CHANNEL = "chatGeneralConsumerChannel";
 public static final String REPLY_TO_PRODUCER_CHANNEL = "replyToProducerChannel_";
 public static final String PRODUCER_TO_GENERAL_CONSUMER_HEARTBEAT_CHANNEL = "ptghbc";
 public static final String GENERAL_CONSUMER_TO_CONSUMER_SEND_BY_GENERAL_HEARTBEAT_CHANNEL = "gctcsbg";
 public static final String ADMIN_USER_DISCONNECTED = "ADMIN_USER_DISCONNECTED";
 public static final String LATEST_GC_USERS = "LATEST_GC_USERS";
 public static final int HEARTBEAT_NUMBER_FOR_BEAN_CREATION = -1;
 public static final String AVAILABLE_USERS = "AVAILABLE_USERS";
 public static final String PUBLISHER_DISCONNECTED_EVENT_FOR_P_TO_GC = "PUBLISHER_DISCONNECTED_EVENT_FOR_P_TO_GC";
 public static final String WEBSOCKET_ERROR_EVENT_FOR_P_TO_GC = "WEBSOCKET_ERROR_EVENT_FOR_P_TO_GC";
 public static final String TEXT_TYPE_EVENT_START="1";
 public static final String TEXT_TYPE_EVENT_STOP="0";
 public static final String YES="Y";
 public static final String NO="N";
 
 public static final int WEBSOCKET_GC_CONNECT_DISCONNECT = 101;
 public static final int REPLY_BACK_TO_ADMIN_COMMAND = 102;
 public static final int SENDING_PAYLOAD_USING_FROMTCP_CHANNEL = 103;
 public static final int SENDING_HEARTBEAT_PRODUCER_TO_GENERAL_CONSUMER = 104;
 public static final int ADMIN_USER_CONNECTION_STATUS_RECEIVER = 105;
 public static final int TEXT_TYPE_EVENT = 106;
 public static final int CHAT_REQUEST_ACCEPTED_EVENT = 106;
 public static final int POST_CHAT_MESSAGE_EVENT = 107;
 
 //General Consumer
 public static final int GENERAL_CONSUMER_TO_PRODUCER_CHANNEL_CONNECT_EVENT = 301;
 public static final int GENERAL_CONSUMER_TO_CONSUMER_CHANNEL_CONNECT_EVENT = 302;
 public static final int GENERAL_CONSUMER_TO_PRODUCER_CHANNEL_RECONNECT_EVENT = 303;
 public static final int GENERAL_CONSUMER_TO_CONSUMER_CHANNEL_RECONNECT_EVENT = 304;
 
}