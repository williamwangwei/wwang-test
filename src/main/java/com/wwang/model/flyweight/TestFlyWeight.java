package com.wwang.model.flyweight;

/**
 当时回答的是false，后来翻了下Integer的源码发现Integer里面有个内部类IntegerCache，用于缓存一些共用的Integer。
 这个缓存的范围可以在jvm启动的时候进行设置。
其实后来想想也应该这么做，我们没有必要每次使用对象的时候都返回新的对象，可以共享这些对象，因为新对象的创建都是需要消耗内存的。
 * @author Administrator
 *
 */
public class TestFlyWeight {
	
	public static void main(String[] args) {
		System.out.println( Integer.valueOf("1") == Integer.valueOf("1") );
	}

}
