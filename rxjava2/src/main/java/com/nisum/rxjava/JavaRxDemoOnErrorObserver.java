package com.nisum.rxjava;

import io.reactivex.disposables.Disposable;

public class JavaRxDemoOnErrorObserver implements io.reactivex.Observer<String>{

	public void onCompleted() {
		 
		System.out.println("completed!!!!!!");
	}

	public void onError(Throwable error) {
		System.out.println("error:"+error.getMessage()); 
	 
	}

	public void onNext(String data) {
		System.out.println(data + ":");
		if("name 2" .equals(data))
			throw new NullPointerException();
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
