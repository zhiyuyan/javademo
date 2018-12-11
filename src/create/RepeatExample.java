//package create;
//
//import rx.Observable;
//import rx.Observer;
//
///**
// * Created by Administrator on 2017/1/13 0013.
// */
//public class RepeatExample {
//
//    public static void main(String[] args) {
//        Observable.just(1,2,3,4).repeat(5)
//                .subscribe(new Observer<Integer>() {
//                    @Override
//                    public void onCompleted() {
//                        System.out.println("onCompleted()");
//                    }
//
//                    @Override
//                    public void onError(Throwable throwable) {
//                        System.out.println("onError()");
//                    }
//
//                    @Override
//                    public void onNext(Integer integer) {
//                        System.out.println("" + integer);
//                    }
//                });
//    }
//
//}
