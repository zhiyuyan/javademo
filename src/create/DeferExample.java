package create;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Func0;

/**
 * Created by Administrator on 2017/1/13 0013.
 */
public class DeferExample {
    public static void main(String[] args) {
        SomeType instance = new SomeType();
        Observable<String> value = instance.valueObservable();
        instance.setValue("Some Value");
        value.subscribe(System.out::println);
    }

    public static class SomeType {
        private String value;

        public void setValue(String value) {
            this.value = value;
        }

        public Observable<String> valueObservable() {
            return Observable.defer(new Func0<Observable<String>>() {
                @Override public Observable<String> call() {
                    return Observable.just(value);
                }
            });
        }
    }
}
