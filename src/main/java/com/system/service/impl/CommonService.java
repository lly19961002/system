package com.system.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.system.entity.User;

import javax.security.auth.Subject;
import java.lang.reflect.Method;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.UnavailableSecurityManagerException;
import org.springframework.stereotype.Service;

@Service
public class CommonService {
    public User getsessionAndSet(Object obj) {
        User user = getSession();
        if(obj==null) {
            return user;
        }
        Method[] methods = obj.getClass().getMethods();
        for (Method method : methods) {
            try {
                switch (method.getName().toLowerCase()) {
                    case "operatornum":
                        method.invoke(obj, user.getOperatornum());
                        break;
                    case "operator":
                        method.invoke(obj, user.getOperator());
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
            }
        }

        return user;

    }

    public User getSession() {
        org.apache.shiro.subject.Subject subject;
        Object obj = null;
        try {
            subject = SecurityUtils.getSubject();
            obj = subject.getSession().getAttribute("Session");
        } catch (UnavailableSecurityManagerException e) {
            //e.printStackTrace();
        }

        if(obj == null){
            User ur = new User();
            return ur;
        }
        return JSONObject.parseObject(obj.toString(),
                User.class);
    }

}
