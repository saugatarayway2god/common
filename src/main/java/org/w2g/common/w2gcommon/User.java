package org.w2g.common.w2gcommon;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
//@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
 @JsonProperty("user_id")
 private String id;
 @JsonProperty("user_name")
 private String name;
 @JsonProperty("thumbDownloadUrl")
 private String thumbDownloadUrl;
 public User() {}



 public User(String id, String name) {
  super();
  this.id = id;
  this.name = name;
 }



 public String getId() {
  return id;
 }
 public void setId(String id) {
  this.id = id;
 }
 public String getName() {
  return name;
 }
 public void setName(String name) {
  this.name = name;
 }
 public String getThumbDownloadUrl() {
  return thumbDownloadUrl;
 }
 public void setThumbDownloadUrl(String thumbDownloadUrl) {
  this.thumbDownloadUrl = thumbDownloadUrl;
 }
 @Override
 public int hashCode() {
  final int prime = 31;
  int result = 1;
  result = prime * result + ((id == null) ? 0 : id.hashCode());
  return result;
 }
 @Override
 public boolean equals(Object obj) {
  if (this == obj)
   return true;
  if (obj == null)
   return false;
  if (getClass() != obj.getClass())
   return false;
  User other = (User) obj;
  if (id == null) {
   if (other.id != null)
    return false;
  } else if (!id.equals(other.id))
   return false;
  return true;
 }

}