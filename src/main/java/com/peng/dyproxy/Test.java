package com.peng.dyproxy;

/**
 * @Description:
 * @Auther: zhangpeng
 * @Date: 2019/7/8
 */
public class Test {
    public static void main(String[] args) {
        UserOne un = UserOneCGProxy.getUser();
        System.out.println(un.getWhat("zhp"));
    }
}
