package com.nisum.rxjava;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableObserver;

 

 
public class RxDisposable {
	
	public static void main(String[] args) {
		Disposable d =
			     Observable.range(1, 5)
			     .subscribeWith(new DisposableObserver<Integer>() {
				 
				 
			         @Override public void onStart() {
			             System.out.println("Start!");
			         }
			          
			         @Override public void onError(Throwable t) {
			             t.printStackTrace();
			         }
			         @Override public void onComplete() {
			             System.out.println("Done!");
			         }
					 

					@Override
					public void onNext(Integer t) {
						// TODO Auto-generated method stub
						 if (t == 3) {
			                 dispose();
			             }
			             System.out.println(t);
					}
			     });
	

	Observable ob =
		     (Observable) Observable.range(1, 5)
	 .subscribe(s-> System.out.println(s));
	 
	
}
}
