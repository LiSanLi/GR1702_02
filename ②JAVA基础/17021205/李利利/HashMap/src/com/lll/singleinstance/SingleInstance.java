package com.lll.singleinstance;

    //单例模式,饿汉模式
public class SingleInstance {
	//1.构造方法私有化
	private SingleInstance(){
		
	}
	//2.成员变量私有,final,常量
	private static final SingleInstance INATANCE = new SingleInstance();

}
