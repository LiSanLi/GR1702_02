package com.lll.singleinstance;

    //����ģʽ,����ģʽ
public class SingleInstance {
	//1.���췽��˽�л�
	private SingleInstance(){
		
	}
	//2.��Ա����˽��,final,����
	private static final SingleInstance INATANCE = new SingleInstance();

}
