//package create;
//
//import rx.Observable;
//import rx.functions.Action0;
//import rx.functions.Action1;
//
///**
// * Created by Administrator on 2017/1/13 0013.
// */
//public class FromExample {
//    public static void main(String[] args) {
//
//        Integer[] items = { 0, 1, 2, 3, 4, 5 };
//        Observable myObservable = Observable.from(items);
//
//        myObservable.subscribe(
//                new Action1<Integer>() {
//                    @Override
//                    public void call(Integer item) {
//                        System.out.println(item);
//                    }
//                },
//                new Action1<Throwable>() {
//                    @Override
//                    public void call(Throwable error) {
//                        System.out.println("Error encountered: " + error.getMessage());
//                    }
//                },
//                new Action0() {
//                    @Override
//                    public void call() {
//                        System.out.println("Sequence complete");
//                    }
//                }
//        );
//    }
//}
