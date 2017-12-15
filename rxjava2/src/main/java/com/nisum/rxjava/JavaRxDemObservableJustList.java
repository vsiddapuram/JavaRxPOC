package com.nisum.rxjava;

import java.util.Arrays;
import java.util.List;

import io.reactivex.Observable;


public class JavaRxDemObservableJustList {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		List<String> namesNull = null;
		List<String> names = Arrays.asList("aaa","bbb","ccc","ddd","eee","ffff","gggg","hhhh","iiiii","jjjj","kkkk","llllllll");
		Observable .just(names).subscribe(
				x-> System.out.println(x),
		x->System.err.println("error"),
		()->System.out.println("completed"));
		
		List<String>  numbers = Arrays.asList ("111","22","111","444","555");
		Observable.just(numbers).subscribe(
				x-> System.out.println(x),
		x->System.err.println("error"),
		()->System.out.println("completed"));
		
		@SuppressWarnings("rawtypes")
		List<String> namesE = Arrays.asList("aaa",null,"ccc","","ddd");
		Observable.just(namesE).subscribe(
				x-> System.out.println(x),
		x->System.err.println("error"),
		()->System.out.println("completed"));
		
		@SuppressWarnings("rawtypes")
		List<String> namesNE = null;
		Observable.just(namesNE).subscribe(
				x-> System.out.println(x),
		x->System.err.println("error"),
		()->System.out.println("completed"));
		
		
	}

}
