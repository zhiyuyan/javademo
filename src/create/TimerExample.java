package create;

import rx.Observable;
import rx.Observer;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017/1/13 0013.
 */
public class TimerExample {

    public static void main(String[] args) {
        Observable.timer(2, TimeUnit.SECONDS)
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
