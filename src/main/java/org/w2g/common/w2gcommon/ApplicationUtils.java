package org.w2g.common.w2gcommon;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.util.Base64;
import java.util.Date;
import java.util.Random;
import java.util.Set;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ApplicationUtils {
 private static Random random = new Random();
 private static int min = 1;
 private static int max = 1000;
 private static int lastHeartBeatNumberToProducer = 0;
 private static int lastHeartBeatNumberToConsumer = 0;
 private static boolean remoteBeancreatedWithProducer = false;
 private static long lastSentHearBeatToProducer = 0;
 private static long lastSentHearBeatToConsumer = 0;
 public static int counterHearBeatToProducer = 0;
 public static int counterHearBeatToConsumer = 0;
 public static boolean doInitConsumer = true;
 public static boolean doInitProducer = true;
 public static EventPayload toEvent(String json) {
  ObjectMapper mapper = new ObjectMapper();
  try {
   System.out.println("json....... " + json);
   return mapper.readValue(json, EventPayload.class);
  } catch (IOException e) {
   throw new RuntimeException("Invalid JSON:" + json, e);
  }
 }

 public static String toJSON(EventPayload event) {
  ObjectMapper mapper = new ObjectMapper();
  try {
   return mapper.writeValueAsString(event);
  } catch (JsonProcessingException e) {
   throw new RuntimeException(e);
  }
 }
 public static < T > String toJSONData(T t) {
  ObjectMapper mapper = new ObjectMapper();
  try {
   return mapper.writeValueAsString(t);
  } catch (JsonProcessingException e) {
   throw new RuntimeException(e);
  }
 }
 public static String encodeString(String json) {
		String asB64 ="";
		try {
			asB64 = Base64.getEncoder().encodeToString( json.getBytes("utf-8"));
		} catch (UnsupportedEncodingException e) {		
			e.printStackTrace();
		}
		return asB64;
	}
 public static String decodecodeStrings(String encodedString) {
		String asB64 ="";
		try {
			byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
			asB64 = new String(decodedBytes);
		} catch (Exception e) {		
			e.printStackTrace();
		}
		return asB64;
	}
 public static int getRandomNumberInts() {
  return random.ints(min, (max + 1)).findFirst().getAsInt();
 }

 public static int getLastHeartBeatNumberToProducer() {
  return lastHeartBeatNumberToProducer;
 }
 public static int getLastHeartBeatNumberToConsumer() {
  return lastHeartBeatNumberToConsumer;
 }
 public static void setLastHeartBeatNumberToProducer(int lastHeartBeatNumberToProducer) {
  ApplicationUtils.lastHeartBeatNumberToProducer = lastHeartBeatNumberToProducer;
 }
 public static void setLastHeartBeatNumberToConsumer(int lastHeartBeatNumberToConsumer) {
  ApplicationUtils.lastHeartBeatNumberToConsumer = lastHeartBeatNumberToConsumer;
 }
 public static long getDiffWithLastSentHearBeatToProducer(long now) {
  return now - lastSentHearBeatToProducer;
 }
 public static long getDiffWithLastSentHearBeatToConsumer(long now) {
  System.out.println("getDiffWithLastSentHearBeatToConsumer : " + now + " - " + lastSentHearBeatToConsumer);

  return now - lastSentHearBeatToConsumer;

 }
 public static void setLastSentHearBeatToProducer(long lastSentHearBeatToProducer) {
  ApplicationUtils.lastSentHearBeatToProducer = lastSentHearBeatToProducer;
 }
 public static void setLastSentHearBeatToConsumer(long lastSentHearBeatToConsumer) {
  ApplicationUtils.lastSentHearBeatToConsumer = lastSentHearBeatToConsumer;
 }
 public static boolean isRemoteBeancreatedWithProducer() {
  return remoteBeancreatedWithProducer;
 }

 public static void setRemoteBeancreatedWithProducer(boolean remoteBeancreatedWithProducer) {
  ApplicationUtils.remoteBeancreatedWithProducer = remoteBeancreatedWithProducer;
 }

 public static int getCounterHearBeatToConsumer() {
  return counterHearBeatToConsumer;
 }

 public static void incrementCounterHearBeatToConsumer() {
  ApplicationUtils.counterHearBeatToConsumer++;
 }
 public static void incrementCounterHearBeatToProducer() {
  ApplicationUtils.counterHearBeatToProducer++;
 }
 public static void throwException(Throwable error) {
  try {
   throw new Exception(error);
  } catch (Exception e) {
   e.printStackTrace();
  }
 }

 public static Date timestampToDate(long time) {
  Timestamp timestamp = new Timestamp(time);
  return new Date(timestamp.getTime());
 }
 
 public static String getReplyChannelName(String userId) {
	 return ApplicationGlobal.REPLY_TO_PRODUCER_CHANNEL+userId;
 }
 public static EventPayload getLatestGCUsers(EventPayload eventPayload,Set<User> gcUsersSet) {
	  EventPayload latestGCUsers = new EventPayload();
	  latestGCUsers.setUserTo(eventPayload.getUserTo());
	  latestGCUsers.setEventName(ApplicationGlobal.LATEST_GC_USERS);
	  MessagePayload messagePayload = new MessagePayload();
	  messagePayload.setPayload(ApplicationUtils.encodeString(ApplicationUtils. < Set < User >> toJSONData(gcUsersSet)));
	  latestGCUsers.setMessagePayload(messagePayload);
	  return latestGCUsers;
 }
}