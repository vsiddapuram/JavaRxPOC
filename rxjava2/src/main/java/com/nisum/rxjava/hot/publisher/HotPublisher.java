package com.nisum.rxjava.hot.publisher;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

 

public class HotPublisher {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*Coldobservables are observables that run their sequence when and if 
		 * they are subscribed to. They present the sequence from the start to each subscriber.
		 *  An example of a cold observable would be Observable.interval. 
		 *  Regardless of when it is created and when it is subscribed to, 
		 *  it will generate the same sequence for every subscriber.
		 */

		Observable<Long> cold = Observable.interval(200, TimeUnit.MILLISECONDS);
				
		cold.subscribe(i -> System.out.println("First: " + i));
		//Thread.sleep(500);
		cold.subscribe(i -> System.out.println("Second: " + i));
	}

}
