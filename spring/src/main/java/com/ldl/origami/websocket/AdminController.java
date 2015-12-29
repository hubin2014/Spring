package com.ldl.origami.websocket;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.socket.TextMessage;

import com.ldl.origami.util.Constants;

@Controller
public class AdminController {
 
    @Bean
    public SystemWebSocketHandler systemWebSocketHandler() {
        return new SystemWebSocketHandler();
    }
 
 
    @RequestMapping("/sendmessage")
    @ResponseBody
    public String auditing(HttpSession session,String message){
    	JSONObject json=new JSONObject();
    	json.put("info", message);
    	String result="N";
    	if(session.getAttribute("username")!=null){    		
    		//单用户发送
    		//systemWebSocketHandler().sendMessageToUser(session.getAttribute("username").toString(), new TextMessage(json.toString()));
    		//所有用户发送
    		systemWebSocketHandler().sendMessageToUsers(new TextMessage(json.toString()));
    		result="Y";
    	}
    	return result;
    }
    @RequestMapping("/login")
    @ResponseBody
    public void login(HttpSession session,String username){
    	session.setAttribute(Constants.SESSION_USERNAME, username);
    }
}
