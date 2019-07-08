package com.peng.dyproxy;

import lombok.Data;

/**
 * @Description:
 * @Auther: zhangpeng
 * @Date: 2019/7/8
 */
@Data
public class UserOne {
    private int age;
    private String name;

    public String getWhat(String what){
        System.out.println("Hell "+what);
        return "You input a word of "+what;
    }
}
