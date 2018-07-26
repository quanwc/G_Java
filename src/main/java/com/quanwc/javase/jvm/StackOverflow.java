package com.quanwc.javase.jvm;

/**
 * 栈溢出:
 *      函数调用是通过栈（stack）这种数据结构实现的，每当进入一个函数调用，栈就会加一层栈帧，每当函数返回，栈就会减一层栈帧。
 *      由于栈的大小不是无限的，所以，递归调用的次数过多，会导致栈溢出。
 *
 *
 * Created by quanwenchao
 * 2018/5/2 14:13:07
 */
public class StackOverflow {

    public static void stackMethod() {
        stackMethod();
    }

    public static void main(String[] args) {
        StackOverflow obj = new StackOverflow();
        obj.stackMethod();
    }
}
