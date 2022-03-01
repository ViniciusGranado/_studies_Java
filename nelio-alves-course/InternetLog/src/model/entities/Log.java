package model.entities;

import java.util.Objects;

public class Log implements Comparable<Log>{
  private User user;
  private String instant;

  public Log() {}

  public Log(User user, String instant) {
    this.user = user;
    this.instant = instant;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public String getInstant() {
    return instant;
  }

  public void setInstant(String instant) {
    this.instant = instant;
  }

  @Override
  public int compareTo(Log o) {
    return user.getName().compareTo(o.getUser().getName());
  }
}
