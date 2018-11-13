package com.bjsxt.init;

import java.util.Set;

import javax.websocket.Endpoint;
import javax.websocket.server.ServerApplicationConfig;
import javax.websocket.server.ServerEndpointConfig;

public class SocketConfig implements ServerApplicationConfig {
    @Override
    public Set<Class<?>> getAnnotatedEndpointClasses(Set<Class<?>> ss) {

        // TODO Auto-generated method stub
        System.out.println("endPoint 开启WebSocket服务" + ss.size());

        return ss;
    }

    @Override
    public Set<ServerEndpointConfig> getEndpointConfigs(Set<Class<? extends Endpoint>> ss) {

        // TODO Auto-generated method stub
        System.out.println("开启WebSocket服务  使用接口" + ss.size());

        return null;
    }
}


