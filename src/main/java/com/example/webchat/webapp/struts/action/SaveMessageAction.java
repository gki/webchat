package com.example.webchat.webapp.struts.action;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

import com.example.webchat.db.bean.MessageBean;
import com.example.webchat.db.dao.MessageDao;
import com.example.webchat.db.dao.impl.MessageDaoOnMemoryImpl;

public class SaveMessageAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        DynaActionForm dynaForm = (DynaActionForm)form;
        Date date = new Date();
        String name = dynaForm.getString("name");
        String message = dynaForm.getString("message");
        MessageDao messageDao = MessageDaoOnMemoryImpl.getInstance();
        messageDao.save(new MessageBean(date, name, message));
        
        dynaForm.set("message", "");
        
        return mapping.findForward("success");
    }
}
