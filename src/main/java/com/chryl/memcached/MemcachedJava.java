package com.chryl.memcached;

import net.spy.memcached.MemcachedClient;

import java.net.InetSocketAddress;

/**
 * Java-memcached
 * <p>
 * Created By Chr on 2019/7/2.
 */
public class MemcachedJava {

    public static void main(String[] args) {
        try {
            //连接本地memcached服务
            MemcachedClient mcc = new MemcachedClient(new InetSocketAddress("127.0.0.1", 11211));
            System.out.println("Connection to server sucessful.");

            //关闭连接
            mcc.shutdown();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
