package com.example.webchat.webapp.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.example.webchat.db.dao.MessageDao;
import com.example.webchat.db.dao.impl.MessageDaoOnMemoryImpl;

public class ShowMessagesAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        MessageDao messageDao = MessageDaoOnMemoryImpl.getInstance();
        request.setAttribute("messages", messageDao.getAll());
        
        return mapping.findForward("success");
    }

}
