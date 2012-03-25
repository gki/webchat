package com.example.webchat.db.dao;

import com.example.webchat.db.bean.MessageBean;

public interface MessageDao {
    public void save(MessageBean bean);
    
    public MessageBean[] getAll();
}
