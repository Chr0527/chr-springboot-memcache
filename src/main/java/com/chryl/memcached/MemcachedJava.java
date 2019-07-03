package com.chryl.memcached;

import net.spy.memcached.MemcachedClient;

import java.net.InetSocketAddress;

/**
 * 
 *Java����memcached
 *
 * @author lhf
 * @createDate 2017��8��9��
 */
public class MemcachedJava {

	public static void main(String[] args) {
		try {
			//��������memcached����
			MemcachedClient mcc = new MemcachedClient(new InetSocketAddress("127.0.0.1",11211));
			System.out.println("memcached�������ӳɹ���");
			//�ر�����
			mcc.shutdown();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
