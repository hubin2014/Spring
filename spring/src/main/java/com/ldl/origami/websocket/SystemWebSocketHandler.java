package com.ldl.origami.websocket;

import java.io.IOException;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;

import com.ldl.origami.util.Constants;

/**
 * 功能描述: 作者: LDL 创建时间: 2014/8/18 10:41
 */
public class SystemWebSocketHandler implements WebSocketHandler {
    private static final Logger logger;
    
    private static final ArrayList<WebSocketSession> userList;
    static {
        userList = new ArrayList();
        logger = LoggerFactory.getLogger(SystemWebSocketHandler.class);
    }
    
    // 连接建立成功后调用该方法
    @Override
    public void afterConnectionEstablished(WebSocketSession session)
            throws Exception {
        userList.add(session);
        // String userName = (String)
        // session.getAttributes().get(Constants.WEBSOCKET_USERNAME);
        // if(userName!= null){
        // //查询未读消息
        // int count =2;
        //
        // session.sendMessage(new TextMessage(count + ""));
        // }
    }
    
    @Override
    public void handleMessage(WebSocketSession session,
            WebSocketMessage<?> message) throws Exception {
    }
    
    @Override
    public void handleTransportError(WebSocketSession session,
            Throwable exception) throws Exception {
        if (session.isOpen()) {
            session.close();
        }
        logger.debug("websocket connection closed......");
        userList.remove(session);
    }
    
    @Override
    public void afterConnectionClosed(WebSocketSession session,
            CloseStatus closeStatus) throws Exception {
        logger.debug("websocket connection closed......");
        userList.remove(session);
    }
    
    @Override
    public boolean supportsPartialMessages() {
        return false;
    }
    
    /**
     * 给所有在线用户发送消息
     * 
     * @param message
     */
    public void sendMessageToUsers(TextMessage message) {
        for (WebSocketSession user : userList) {
            try {
                if (user.isOpen()) {
                    user.sendMessage(message);
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    /**
     * 给某个用户发送消息
     * 
     * @param userName
     * @param message
     */
    public void sendMessageToUser(String userName, TextMessage message) {
        for (WebSocketSession user : userList) {
            if (userName.equals(user.getAttributes()
                    .get(Constants.SESSION_USERNAME))) {
                try {
                    // 判断该用户是否在线
                    if (user.isOpen()) {
                        // 向该用户发送信息
                        user.sendMessage(message);
                    }
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }
}
