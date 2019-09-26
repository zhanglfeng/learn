package com.cn.learn.exception;


/**
 * 这个程序给了我们一些思路（确实。。），如果把try块放在循环里，就建立了一个“程序继续执行之前必须要到达”的条件。
 *
 *　　还可以加入一个static类型的计数器或者别的装置，使循环在放弃之前能够尝试一定的次数。这将使程序的健壮性更上一个台阶（好叼的样子）。
 *
 *　　1）finally用来做什么
 *
 *　　　　当要把除内存之外的资源恢复到它们的初始状态时，就要用到finally子句。
 *
 *　　2）在return中使用finally
 *
 *　　　　因为finally子句总是会执行的，所以在一个方法中，可以从多个点返回，并且可以保证重要的清理工作仍旧会执行：
 *
 *
 */
public class FinallyWorks {
	static int count = 0;

	public static void main(String[] args) {
		while (true) {
			try {
				if (count++ == 0) {
					throw new TwoException();
				}
				System.out.println("No exception");
			} catch (TwoException e) {
				System.out.println("TwoException");
			} finally {
				System.out.println("In finally clause");
				if (count == 2)
					break;
			}
		}
	}
}



class TwoException extends Exception {
	private static final long serialVersionUID = -3505470544355049648L;
}



