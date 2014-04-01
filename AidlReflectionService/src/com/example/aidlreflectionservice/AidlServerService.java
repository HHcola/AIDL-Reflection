package com.example.aidlreflectionservice;

import com.example.aidlreflectionservice.IAIDLServerService.Stub;
import com.example.aidlreflectionservice.IAIDLServerService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
public class AidlServerService extends Service {
	@Override
	public IBinder onBind(Intent intent) {
		return mBinder;
	}
	/**
	 * 在AIDL文件中定义的接口实现。
	 */ 
	
	private IAIDLServerService.Stub mBinder = new Stub() {
		
		public String sayHello() throws RemoteException {
			return "Hello";
		}
		
		public Book getBook() throws RemoteException {
			Book mBook = new Book();
			mBook.setBookName("Android应用开发");
			mBook.setBookPrice(50);
			return mBook;
		}
	};

}
