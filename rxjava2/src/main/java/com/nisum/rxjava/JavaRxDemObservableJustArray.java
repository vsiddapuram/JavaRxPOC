package com.nisum.rxjava;

import io.reactivex.Observable;

public class JavaRxDemObservableJustArray {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		
		String[] names = new String[] {"aaa","bbb","aaa","ddd"};
		 Observable.just(names).subscribe(
				x-> System.out.println(Observable.fromArray(x).distinct()),
		x->System.err.println("error"),
		()->System.out.println("completed"));
		
		Integer[]  numbers = new Integer[] {111,22,111,444,555};
		Observable.just(numbers).subscribe(
				x-> System.out.println(x),
		x->System.err.println("error"),
		()->System.out.println("completed"));
		
		String[]  namesE = new String[] {"aaa",null,"ccc","","ddd"};
		Observable.just(namesE).distinct().subscribe(
				x-> System.out.println(x),
		x->System.err.println("error"),
		()->System.out.println("completed"));
		
		String[]  namesNE = new String[] {"aaa","5/0","ccc","ddd"};
		Observable.just(namesNE).subscribe(
				x-> System.out.println(x),
		x->System.err.println("error"),
		()->System.out.println("completed"));
		
		
	}

}
