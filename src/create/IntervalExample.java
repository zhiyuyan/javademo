package create;

import rx.Observable;
import rx.Observer;
import rx.Subscription;
import rx.schedulers.Schedulers;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017/1/13 0013.
 */
public class IntervalExample {

    public static void main(String[] args) {
        Subscription subscription = Observable.interval(1, TimeUnit.SECONDS, Schedulers.computation())
                .subscribe(new Observer<Long>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable throwable) {

                    }

                    @Override
                    public void onNext(Long aLong) {
                        System.out.println("" + aLong);
                    }
                });
        while (true) {

        }
    }

}
