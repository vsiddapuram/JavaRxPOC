package com.nisum.rxjava;

import javax.jws.soap.SOAPBinding;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
 

public class JavaRxDemoOnNextObserver implements Observer<String>{

	public void onCompleted() {
		 
		System.out.println("completed!!!!!!");
	}

	public void onError(Throwable error) {
		System.out.println("error:"+error.getMessage()); 
	}

	public void onNext(String data) {
		System.out.println(data + ":");
		 
	}

	@Override
	public void onComplete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onSubscribe(Disposable arg0) {
		// TODO Auto-generated method stub
		
	}

}
