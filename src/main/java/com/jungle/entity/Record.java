package com.jungle.entity;

import java.util.Date;

/**
 * Created by User on 16.03.2016.
 */
public class Record {

    private final int id;
    private final String title;
    private final String content;
    private final Date creationDate;

    public Record(int id, String title, String content, Date creationDate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.creationDate = creationDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }
}
