package org.w2g.common.w2gcommon;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class MessagePayload {

    @JsonProperty("id")
    private String id;

	@JsonProperty("type")
    private String type;

    @JsonProperty("receiver_name")
    private String receiverName;

    @JsonProperty("payload")
    private String payload;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}

	@Override
	public String toString() {
		return "MessagePayload [id=" + id + ", type=" + type + ", receiverName=" + receiverName + ", payload=" + payload
				+ "]";
	}


}

