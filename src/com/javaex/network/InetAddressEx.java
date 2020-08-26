package com.javaex.network;

import java.net.InetAddress;
import java.rmi.UnknownHostException;

// 인터넷 주소에 관련된 InetAddress 클래스 이해
public class InetAddressEx {
	
	public static void main(String[] args) {
		// 원격 서버의 IP 주소 확인
		printServerIp("www.google.com");
	}
	
	 private static void printServerIp(String hostname) {
		 try {
			 // Local IP 확인
			 InetAddress local = InetAddress.getLocalHost();
			 System.out.println("Local IP: " + local.getHostAddress());
		 } catch (UnknownHostException e) {
			 e.printStackTrace();
		 }
	 }
}
