package com.nisum.rxjava;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;

public class JavaRxDemoObservableFromArrayLimit {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		
		List<String> names = Arrays.asList("aaa","bbb","ccc","ddd","eee","ffff","gggg","hhhh","iiiii","jjjj","kkkk","llllllll","aaa");
	 	
		/*Observable<List<String>> namesJustObservable = Observable.just(names);
		Flowable<List<String>> namesJustIFlowable = Flowable.just(names);  
		*/
		Observable< String > namesJustObservable = Observable.fromIterable(names);
		Flowable<String> namesJustIFlowable = Flowable.fromIterable(names);  
		
		
		namesJustObservable.
			distinct()
			.takeLast(2)
			.startWith("aa")
			.subscribe(
				x-> System.out.println("Observable--->"+x),
				x->System.err.println("error"),
				()->System.out.println("completed")
				);

		

		namesJustObservable.
			distinct()
			 
			.startWith("close")
			.subscribe(
				x-> System.out.println("Observable--->"+x),
				x->System.err.println("error"),
				()->System.out.println("completed")
				);
		
		namesJustIFlowable
		.take(3)
		.subscribe(
									x-> System.out.println("onNext-->"+x),
									x->System.err.println("error"),
									()->System.out.println("completed")
									);
		
		Single.just(names).subscribe(s->System.out.println(s),e->System.out.println(e));
	Single single = 	Single.just(names);
		
		Single.just(names).subscribe(s->System.out.println(s),e->System.out.println(e));
		Maybe.just(names).subscribe(s->System.out.println(s),e->System.out.println(e));
		Completable.fromSingle(single).subscribeWith( new CompletableObserver() {
			
			@Override
			public void onSubscribe(Disposable disposable) {
				// TODO Auto-generated method stub
				 System.out.println(disposable);
			}
			
			@Override
			public void onError(Throwable throwable) {
				// TODO Auto-generated method stub
				 System.out.println(throwable);
			}
			
			@Override
			public void onComplete() {
				// TODO Auto-generated method stub
				System.out.println("completed");
			}
		});
				
								 
		
		 
	 
		 
		 
	}

}
