package com.nisum.rxjava;

import java.util.Arrays;
import java.util.List;

import io.reactivex.Observable;

 

public class JavaRxDemObservableFromList {
	static Integer result = null;
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		
		List<String> names = Arrays.asList("aaa","bbb","ccc","ddd");
		Observable.fromArray(names).subscribe(
				x-> System.out.println("item-->"+x),
		x->System.err.println("error"),
		()->System.out.println("items completed"));
		
	/*	//requires non null object
		List namesNE = null;
		Observable.just(namesNE).subscribe(
				x-> System.out.println("item here"+x),
		x->System.err.println("if namesNE error"),
		()->System.out.println("if namesNE completed"));
		
		
		
		
		*/
		//requires non null object
		/*		List namesNE = null;
				Observable.fromArray(namesNE).isEmpty().
				subscribe(s->System.out.println(s),
						e->System.out.println(e) );
		*/
		//distinct
		
		List<Integer> numbers = Arrays.asList(111,222,111,444,555);
		Observable.fromIterable(numbers).distinct().subscribe(
		x-> System.out.println(result=x),
		x->System.err.println("distinct error"),
		()->System.out.println("distinct completed"));
		 
		
		/*//no null values allowed in fromIterable Observable
		@SuppressWarnings("rawtypes")
		List namesE = Arrays.asList("aaa",null,"ccc","".equals("dd"),"ddd");
		Observable.fromIterable(namesE).subscribe(
				x-> System.out.println(x),
		x->System.err.println("error"),
		()->System.out.println("completed"));*/
		
	/*	@SuppressWarnings("rawtypes")
		List namesE = Arrays.asList("aaa",null,"ccc","".equals("dd"),"ddd");
		Observable.fromArray(namesE).map( item-> (null !=item)? item : "" ).subscribe(
				x-> System.out.println(),
		x->System.err.println("error"),
		()->System.out.println("completed"));*/
		
		
		 
		
		
		
		
	}

}
