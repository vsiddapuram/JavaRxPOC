package com.nisum.rxjava;

import java.util.Arrays;
import java.util.List;

import io.reactivex.Observable;
 

public class JavaRxDemoProducer {
	
	public static void main(String[] args) {
		
		/** will demo 'from' 
		 * each item in the list is processed by onNext()
		 */
		List<String> names = Arrays.asList("name1","name 2" , "name 3");
		//testing onNext
		 Observable<String> namesObservable = Observable.fromIterable(names);
		namesObservable.subscribe(new JavaRxDemoOnNextObserver());
		
		/** following code will demo onError scenario*/
		//Observable<String > namesErrorObservable = Observable.from(names);
		//namesErrorObservable.subscribe(new JavaRxDemoOnErrorObserver());
		
		/**following opetation will throw UnsupportedOperationException */
		//names.add("test");
		
	}

}
