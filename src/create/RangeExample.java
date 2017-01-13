package create;

import rx.Observable;
import rx.Observer;
import rx.Subscription;
import rx.schedulers.Schedulers;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017/1/13 0013.
 */
public class RangeExample {

    public static void main(String[] args) {
        Observable.range(1, 10000)
                .subscribe(new Observer<Integer>() {
                    @Override
                    public void onCompleted() {
                        System.out.println("onCompleted()");
                    }

                    @Override
                    public void onError(Throwable throwable) {
                        System.out.println("onError()");
                    }

                    @Override
                    public void onNext(Integer integer) {
                        System.out.println("" + integer);
                    }
                });
    }

}
