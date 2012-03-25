package com.example.webchat.db.bean;

import java.util.Date;

public class MessageBean {
    private Date date = null;
    private String name = null;
    private String message = null;
    public MessageBean(Date date, String name, String message){
        setDate(date);
        setName(name);
        setMessage(message);
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
