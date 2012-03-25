package com.example.webchat.db.dao.impl;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.example.webchat.db.bean.MessageBean;
import com.example.webchat.db.dao.MessageDao;

public class MessageDaoOnMemoryImpl implements MessageDao {
    
    private static final MessageDaoOnMemoryImpl instance = new MessageDaoOnMemoryImpl();
    
    private MessageDaoOnMemoryImpl(){}
    
    public static MessageDaoOnMemoryImpl getInstance(){
        return instance;
    }
    
    private List<MessageBean> messages = Collections.synchronizedList(new LinkedList<MessageBean>());

    public void save(MessageBean bean) {
        messages.add(0, bean);
    }

    public MessageBean[] getAll() {
        return messages.toArray(new MessageBean[messages.size()]);
    }
}
