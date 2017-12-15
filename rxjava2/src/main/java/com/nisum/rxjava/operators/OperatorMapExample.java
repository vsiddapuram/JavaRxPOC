package com.nisum.rxjava.operators;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import io.reactivex.Observable;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.observers.ConsumerSingleObserver;
import io.reactivex.internal.operators.single.SingleSubscribeOn;
import io.reactivex.subscribers.DisposableSubscriber;

public class OperatorMapExample {
	static Set set = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*Map
			
			The map method is called on each event that is produced and 
			is used for transforming one type of data to another.
			 In the example below, the Strings are mapped to their 
			 corresponding hashCode values (a number).*/
			Observable.fromArray("item1","item2","item3")
			.map(s->s.length())
			.subscribe(s->System.out.println("map:"+s));
			
			
			Observable.fromArray("test","test2","test3")
			.flatMap(s->Observable.fromArray(s.toUpperCase(),s.hashCode(),s.length()))
			.subscribe(s->System.out.print("\t "+s+"\t"));
			
			
			/*Scan takes two parameters, the first one is an initial state and the second one is a function (Java 8’s BiFunctional interface).
			 
			The result is then used with the second item when calling the function for the second time. I think an example will make it clearer.
			we are first setting the initial value to zero. In the function, we are taking the previous outcome
			(in the first iteration it is the initial value 0), and adding it to the length of the string. Which means that it’s just counting the number of letters in our strings (including the whitespace).
			If we wanted to ignore the whitespace, we could use the map function as well*/
			
			Observable.fromArray("1,2,3");
			Observable.fromArray("123","abc","defh","ddd")
			 .scan(0,(total,s)->total+s.length())
			.subscribe(s->System.out.println(s+" >>>"));
			
			
			Observable.just("123","abc","def","ddd")
			.map(s->s.hashCode())
			.subscribe(s->System.out.println(s+"-->")); 
			
			
			
			Observable.fromArray("123","abc","def","ddd")
			//.map(s->s.hashCode())
			//.map(s->s.hashCode())
			.filter(s->s.startsWith("d"))
			.subscribe(System.out::println);
			
			List<DomainObj> list = new ArrayList<DomainObj>();
			
			list.add(new DomainObj(1,"laxmi","closed"));
			list.add(new DomainObj(2,"laxmikiran","open"));
			list.add(new DomainObj(3,"hansa","closed"));
			
			 
			Observable.fromIterable(list)
			.subscribe(s->new DisposableSubscriber() {
				@Override
				public void onComplete() {
					// TODO Auto-generated method stub
					
				}
				@Override
				public void onError(Throwable arg0) {
					// TODO Auto-generated method stub
					
				}
				@Override
				public void onNext(Object arg0) {
					// TODO Auto-generated method stub
					
				}
			});
			
			Observable.fromIterable(list)
			.subscribe(s->new SingleOnSubscribe<String>() {
				@Override
				public void subscribe(SingleEmitter<String> emitter) throws Exception {
					// TODO Auto-generated method stub
					System.out.println(emitter);
					  emitter.setDisposable(new Disposable() {
						
						@Override
						public boolean isDisposed() {
							// TODO Auto-generated method stub
							return false;
						}
						
						@Override
						public void dispose() {
							// TODO Auto-generated method stub
							System.out.println("dispose");
							
						}
					});
				}
			});
			
			
			 Observable.fromIterable(list)
			.filter(s->(!s.getStatus().equals("") && s.getStatus().equals("closed")))
			.toMap(s->s.getId()).subscribe(x-> System.out.println(set=x.keySet()));
			 
			
					  
			
			
	}

}
