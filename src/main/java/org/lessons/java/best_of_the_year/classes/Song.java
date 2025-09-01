package org.lessons.java.best_of_the_year.classes;

import java.io.Serializable;

public class Song implements Serializable {

  private Integer id;
  private String title;

  public Song() {
  };

  public Song(Integer id, String title) {
    this.id = id;
    this.title = title;
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
