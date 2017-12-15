package com.nisum.rxjava;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Single;

 

public class JavaRxDemoCreateObserver {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		List<String> names = Arrays.asList("name1", "xxx 2", "name 3");

		 
		Observable.create(subscriber -> {
			try {
				Iterator<String> iterator = names.iterator();
				while (iterator.hasNext()) {
					if (subscriber.isDisposed())
						return;
					subscriber.onNext(iterator.next());
				///error 
					//int a=1/0;
				}
				if (!subscriber.isDisposed())
					subscriber.onComplete();
			} catch (Exception e) {
				if (!subscriber.isDisposed())
					subscriber.onError(e);
			}
			//filter
		}).filter(x->x.toString().startsWith("name") ).subscribe(x-> System.out.println("starts with name::::"+x),
					 x->System.err.println("error"),
					 ()->System.out.println("completed"));
		
	
	
	
	
	
	Observable.create(subscriber -> {
		try {
			Iterator<String> iterator = names.iterator();
			while (iterator.hasNext()) {
				if (subscriber.isDisposed())
					return;
				subscriber.onNext(iterator.next());
			 
			}
			if (!subscriber.isDisposed())
				subscriber.onComplete();
		} catch (Exception e) {
			if (!subscriber.isDisposed())
				subscriber.onError(e);
		}
		//filter
	}).isEmpty().subscribe(x-> System.out.println("IsEmpty::::"+x),
				 x->System.err.println("error")
				 );
	

	
	
	
	Single .create(subscriber -> {
		try {
			Iterator<String> iterator = names.iterator();
			while (iterator.hasNext()) {
				if (subscriber.isDisposed())
					return;
				subscriber.onSuccess("its success"); 
		 
			}
			 
		} catch (Exception e) {
			if (!subscriber.isDisposed())
				subscriber.onError(e);
		}
		//filter
	}) .subscribe(x-> System.out.println(x),
				 x->System.err.println("error") 
				 );
	

	
	
	
	}
}
