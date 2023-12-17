package com.javaReview;

/**
 * @author redA
 * @时间: 2023年12月17日 11:11
 */
/**
 * JDK1.5之后，新增了自动拆、装箱功能
 * 缓存以支持 JLS 要求的 -128 和 127（含）之间值的自动装箱的对象标识语义。
 * 缓存在第一次使用时初始化。 缓存的大小可以由 -XX:AutoBoxCacheMax=<size> 选项控制。
 * 在VM初始化过程中，java.lang.Integer.IntegerCache.high属性可能会被设置并保存在sun.misc.VM类的私有系统属性中
 *
 * 1、IntegerCache 缓存范围为 -128~127（默认范围）
 * 2、大小可由 -XX:AutoBoxCacheMax调整
 */
public class IntegerTest {
    public static void main(String[] args) {

        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1 == i2);

        Integer i3 = -128;
        Integer i4 = -128;
        System.out.println(i3 == i4);

        Integer i5 = -150;
        Integer i6 = -150;
        System.out.println(i5 == i6);

        Integer i7 = 130;
        Integer i8 = 130;
        System.out.println(i7 == i8);

        Integer i9 = new Integer("127");
        Integer i10 = new Integer("127");
        System.out.println(i9 == i10);
    }
}