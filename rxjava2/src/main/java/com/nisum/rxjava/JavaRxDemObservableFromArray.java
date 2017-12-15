package com.nisum.rxjava;

import io.reactivex.Observable;
import io.reactivex.internal.operators.observable.ObservableFlatMap;
import io.reactivex.internal.operators.observable.ObservableFromIterable;
 

public class JavaRxDemObservableFromArray {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		/** will demo 'from' 
		 * each item in the array is processed by onNext()
		 */
		String[] names = new String[] {"aaa","bbb","ccc","ddd"};
		 Observable.fromArray(names).subscribe(
				 
				x-> System.out.println(x),
		e->System.err.println("error"),
		()->System.out.println("completed"));
		
		/*String[]  numbers = new String[] {"111","222","333","444","555"};
		ObservableFromIterable.fromArray(numbers).subscribe(
				x-> System.out.println(x),
		x->System.err.println("error"),
		()->System.out.println("completed"));
		
		String[]  namesE = new String[] {"aaa",null,"ccc","","ddd"};
		Observable.fromArray(namesE).subscribe(
				x-> System.out.println(x),
		x->System.err.println("error"),
		()->System.out.println("completed"));
		
		String[]  namesNE = new String[] {"aaa","5/0","ccc","ddd"};
		Observable.fromArray(namesNE).subscribe(
				x-> System.out.println(x),
		x->System.err.println("error"),
		()->System.out.println("completed"));*/
		
		
	}

}
