package com.cn.learn;

/**
 * 二分查找： 使用二分查找法的前提条件是数组中的元素必须已经排好序 二分查找法首先将关键字与数组的中间元素进行比较，有下面3种情况
 * 1.如果关键字小于中间元素，只需要在数组的前一半元素中继续查找 2.如果关键字大于中间元素，只需要在数组的后一半元素中继续查找
 * 3.如果关键字与中间元素相等，那么就找到了，查找结束 如一个有1024（2^10）个元素的数组，最好情况下只需要比较11次，最坏情况下要比较1023次
 */
public class SearchTest {
	public static void main(String[] args) {

		int[] list = { 1, 4, 4, 2, 5, -3, 6, 2 };
		int i = lineraSearch(list, 4);
		System.out.println(i);
		int j = lineraSearch(list, -4);
		System.out.println(j);
		int k = lineraSearch(list, -3);
		System.out.println(k);

		System.out.println("--------");
		
		int[] list1 = { 2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79 };
		int i1 = binarySearch(list1, 2);
		System.out.println(i1);
		int j1 = binarySearch(list1, 11);
		System.out.println(j1);
		int k1 = binarySearch(list1, 79);
		System.out.println(k1);

	}

	/**
	 * 线性查找法——最简单、最low
	 * 
	 * @param list
	 * @param key
	 * @return
	 */
	public static int lineraSearch(int[] list, int key) {
		for (int i = 0; i < list.length; i++) {
			if (key == list[i]) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * 二分查找法
	 * 
	 * @param list
	 * @param key
	 * @return
	 */
	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;
		while (high >= low) {
			int mid = (high + low) / 2;
			if (key < list[mid]) {
				high = mid - 1;
			} else if (key == list[mid]) {
				return mid;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

}
