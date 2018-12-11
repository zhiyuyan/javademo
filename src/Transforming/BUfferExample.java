//package Transforming;
//
//import rx.Observable;
//import rx.Subscriber;
//
//import java.util.List;
//
///**
// * Created by Administrator on 2017/1/14 0014.
// */
//public class BufferExample {
//
//    public static void main(String[] args) {
//        Observable.just(1,2,3,4).repeat(10)
//                .buffer(2,3)
//                .subscribe(new Subscriber<List<Integer>>() {
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
//                    public void onNext(List<Integer> integers) {
//                        System.out.println(integers.toString());
//                    }
//                });
//    }
//
//}
