package com.nisum.rxjava;

import io.reactivex.Observable;

public class MapVsFlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Observable mapObservable = Observable.just("item1","item2");
		
		mapObservable.just("item1","item2")
         .map( str -> {
             //System.out.println("inside the map " + str);
            // return str;
            return Observable.just(str + "+", str + "++" , str + "+++");
         })
         .subscribe(System.out::println);

		 Observable.just("item3","item4")
         .flatMap( str -> {
            // System.out.println("inside the flatMap " + str);
             return Observable.just(str + "+", str + "++" , str + "+++");
         })
         .subscribe(System.out::println);

	}

}
