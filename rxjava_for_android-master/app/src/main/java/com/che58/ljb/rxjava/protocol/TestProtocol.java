package com.che58.ljb.rxjava.protocol;

import com.che58.ljb.rxjava.net.XgoHttpClient;

import java.util.Map;

import rx.Observable;

/**
 * 测试接口
 * Created by ljb on 2016/3/23.
 */
public class TestProtocol extends BaseProtocol {

//    private static final String BASE_URL = "http://service.test.xgo.com.cn:8080/app/v1/demo/";
    private static final String URL = "http://api.bailitop.com/appsite/v1/channels/button?userid=999&utype=2";

    /**
     * Get请求
     */
    public Observable<String> text_Get() {
        String path = "1";
        return createObservable(URL, "GET", null);   // (1)
    }


    /**
     * Post请求
     */
    public Observable<String> text_Post(Map<String , Object> params) {
        return createObservable(URL, XgoHttpClient.METHOD_POST, params);
    }

    /**
     * Put请求
     */
    public Observable<String> text_Put(Map<String , Object> params) {
        return createObservable(URL, XgoHttpClient.METHOD_PUT, params);
    }

    /**
     * Delete请求
     */
    public Observable<String> text_Delete() {
        String path = "1";
        return createObservable(URL, XgoHttpClient.METHOD_DELETE, null);
    }

}
