package create;

import rx.Observable;
import rx.Observer;

/**
 * Created by Administrator on 2017/1/13 0013.
 */
public class Empty_Never_ThrowExample {
    public static void main(String[] args) {
        // Empty
        Observable.empty().subscribe(new Observer<Object>() {
            @Override
            public void onCompleted() {
                System.out.println("onCompleted()");
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("onError()");
            }

            @Override
            public void onNext(Object o) {
                System.out.println("onNext()");
            }
        });
        // Never
        Observable.never().subscribe(new Observer<Object>() {
            @Override
            public void onCompleted() {
                System.out.println("onCompleted()");
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("onError()");
            }

            @Override
            public void onNext(Object o) {
                System.out.println("onNext()");
            }
        });
        // Throw
        Observable.error(new Throwable("aaaaaa")).subscribe(new Observer<Object>() {
            @Override
            public void onCompleted() {
                System.out.println("onCompleted()");
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("onError()" + throwable.getMessage());
            }

            @Override
            public void onNext(Object o) {
                System.out.println("onNext()");
            }
        });
    }
}
