package com.cn.learn;

import java.util.Arrays;

/**
 * 排序
 */
public class SortTest {

	public static void main(String[] args) {
		/*		
		int[] arr = { 2, 9, 5, 4, 8, 1 };
		System.out.println("原始数组: " + Arrays.toString(arr));

		System.out.println("");
		bubbleSort(arr);
		System.out.println("冒泡排序: " + Arrays.toString(arr));
		
		
		System.out.println("");
		insertionSort(arr);
		System.out.println("插入排序: " + Arrays.toString(arr));
		
		
		System.out.println("");
		quickSort(arr, 0, arr.length - 1);
		System.out.println("快速排序: " + Arrays.toString(arr));
		
		
		System.out.println("");
		selectionSort(arr);
		System.out.println("选择排序: " + Arrays.toString(arr));
		
		
		
		System.out.println("");
		int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
		mergeSort(list);
		System.out.println("归并排序: " + Arrays.toString(list));
		*/
		
		
		int[] arr = { 2, 9, 5, 4, 8, 1, 7 };
		System.out.println("原始数组: " + Arrays.toString(arr));
		System.out.println("");
		mergeSort(arr);
		System.out.println("归并排序: " + Arrays.toString(arr));
		
		
		
		
		
		
		
		

	}
	

	
	/**
	 * 冒泡排序：
	 * 将相邻的两个数据元素按关键字进行比较，如果反序，则交换。对于一个待排序的数据序列，经一趟排序后，最大值数据元素移到最后位置，其它值较大的数据元素也向最终位置移动，此过程称为一趟起泡。
	 * 
	 * 冒泡排序算法是稳定的，时间复杂度为O(n^2)。
	 * 
	 * @param a
	 * @return
	 */
    public static int[] bubbleSort(int[] a) {
        // 设置判断，进行优化
        // 如果某次遍历中没有发生交换，那么就不用再进行下去，因为排序已完成
        boolean ac = true;
        for (int k = 1; k < a.length & ac; k++) {
            ac = false;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    ac = true;
                }
            }
        }
        return a;
    }
    
    
	
	/**
	 * 插入排序
	 *     1.外层循环（循环控制变量i）的迭代是为了获取已排好序的子数列
	 *     2.内层循环（循环控制变量k）将list[i]插入到从list[0]到list[i-1]的子数列中
	 */
	public static void insertionSort(int[] array) {
	    for (int i = 1; i < array.length; i++) {
	        int minValue = array[i];
	        int k;
	        for (k = i - 1;k >= 0 && minValue < array[k]; k--) {
	            array[k + 1] = array[k];
	        }
	        array[k + 1] = minValue;
	    }
	}
	
	

    /**
     * 快速排序：
     * 快速排序是目前平均性能较好的一种排序算法。
     * 
     * 在待排序的数据序列中任意选择一个值作为基准值，由序列的两端交替地向中间进行比较、交换，使得所有比基准值晓得元素都处于序列的左端，比基准值大的元素都处于序列的右端，这样序列就被划分成两个子序列。
     * 再对两个子序列分别进行同样的操作，直到子序列的长度为1时，则已排好序。每趟排序完，作为基准值的数据元素需要找到它在排好序的序列中的最终位置。
     * 
     * @param s
     * @param l
     * @param r
     * @return
     */
    public static int[] quickSort(int s[], int l, int r) {
        if (l < r) {
            // Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换 参见注1
            int i = l, j = r, x = s[l];
            while (i < j) {
                // 从右向左找第一个小于x的数
                while (i < j && s[j] >= x)
                    j--;
                if (i < j)
                    s[i++] = s[j];

                // 从左向右找第一个大于等于x的数
                while (i < j && s[i] < x)
                    i++;
                if (i < j)
                    s[j--] = s[i];
            }
            s[i] = x;
            quickSort(s, l, i - 1); // 递归调用 从右至左
            quickSort(s, i + 1, r); // 从左至右
        }
        return s;
    }
    
    
    
    
    
    /**
     * 选择排序：
     * 设待排序的数据序列有n个元素，第1趟排序，比较n个元素，选择关键字最小的元素，将其交换到序列的第1个位置上；
     * 第2趟排序，在余下的n-1个元素中，再选取关键字最小的元素，交换到序列的第2个位置上.....经过n-1趟排序，n个元素的数据序列则按递增次序排序完成。
     * 
     * 直接选择排序算法是不稳定的
     * 
     * 选择排序
     *     1.选择排序法先找到数列中最小的数
     *     2.然后将它放在数列的最前面
     *     3.在剩下的数中，循环1、2操作
     */
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minValue = array[i];
            int minIndex = i;
            for (int j = i + 1;j < array.length;j++) {
                if (array[j] < minValue) {
                    minValue = array[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                array[minIndex] = array[i];
                array[i] = minValue;
            }
        }
    }
    
    
    
    
    /**
     * 归并排序： 
     * 归并排序算法可以递归地描述为：算法将数组分为两半，对每部分递归地应用归并排序。在两部分都排好序后，对它们进行归并。
     * 
     * 递归调用持续将数组划分为子数组，直到每个子数组只包含一个元素。然后，该算法将这些小的子数组归并为稍大的有序子数组，直到最后形成一个有序的数组。
     * 
     * @param list
     */
    public static void mergeSort(int[] list) {
        if(list.length > 1) {
            // 拆分过程
            // 第一半儿
            int[] firstHalf = new int[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            // 将这一半儿再拆成两半儿
            mergeSort(firstHalf);
            
            // 第二半儿
            int secondHalfLength = list.length - list.length / 2;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
            // 将这一半儿再拆成两半儿
            mergeSort(secondHalf);
            
            // 将两半儿数组归并成一个新的有序数组temp
            int[] temp = merge(firstHalf, secondHalf);
            // 将temp赋给原始数组list
            System.arraycopy(temp, 0, list, 0, temp.length);
        }
    }
    
    private static int[] merge(int[] list1, int[] list2) {
        // 将拆分出来的两个数组归并为排好序的一个数组
        int[] temp = new int[list1.length + list2.length];
        int current1 = 0; // 指向list1当前考虑的元素
        int current2 = 0; // 指向list2当前考虑的元素
        int current3 = 0; // 指向temp当前考虑的元素
        
        while(current1 < list1.length && current2 < list2.length) {
            if(list1[current1] < list2[current2]) {
                // 如果较小的元素在list1中，current1增加1
                temp[current3++] = list1[current1++];
            }else {
                // 如果较小的元素在list2中，current2增加1
                temp[current3++] = list2[current2++];
            }
        }
        // 如果list1和list2中仍有未移动的元素，就将它们复制到temp中
        while(current1 < list1.length) {
            temp[current3++] = list1[current1++];
        }
        while(current2 < list2.length) {
            temp[current3++] = list2[current2++];
        }
        // 将temp作为一个新的有序数组返回
        return temp;
    }
    
    
    
    
	
	
	
	
	

}
