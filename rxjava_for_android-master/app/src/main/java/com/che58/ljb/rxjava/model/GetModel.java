package com.che58.ljb.rxjava.model;

import java.util.List;

/**
 * Get数据 JavaBean
 * Created by ljb on 2016/4/7.
 */
public class GetModel {
    public int status;
    public String message;
    public DataBean data;

    public static class DataBean {
        /**
         * labelid : 25
         * title : 加拿大案例
         * isstart : 1
         */
        public List<DefaultPBean> default_p;
        /**
         * labelid : 23
         * title : 日本案例
         * isstart : 1
         */

        public List<OtherPBean> other_p;

        @Override
        public String toString() {
            return "DataBean{" +
                    "default_p=" + default_p +
                    ", other_p=" + other_p +
                    '}';
        }

        public static class DefaultPBean {
            public String labelid;
            public String title;
            //public String isstart;


            @Override
            public String toString() {
                return "DefaultPBean{" +
                        "labelid='" + labelid + '\'' +
                        ", title='" + title + '\'' +
                        '}';
            }
        }

        public static class OtherPBean {
            public String labelid;
            public String title;
            //public String isstart;


            @Override
            public String toString() {
                return "OtherPBean{" +
                        "labelid='" + labelid + '\'' +
                        ", title='" + title + '\'' +
                        '}';
            }
        }
    }

    @Override
    public String toString() {
        return "GetModel{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
