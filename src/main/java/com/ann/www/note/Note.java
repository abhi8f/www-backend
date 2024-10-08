package com.ann.www.note;

import jakarta.persistence.*;

@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private String content;

    public Note(Integer id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public Note() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
