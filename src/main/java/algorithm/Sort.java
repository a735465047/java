package algorithm;

/**
 * author: qiaohong.wang.
 * created on 2017/5/24.
 */
public class Sort {
    /*
    冒泡排序，时间复杂度为o(n*2),效率不高
     */
    public static int[] bubbleSort(int[] data) {
        int length = data.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int tmp;
                    tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                }
            }

        }
        return data;
    }

    /*
    快速排序，递归算法，时间复杂度o(nlogn)
     递归算法解决问题的特点：
        1）递归就是方法里调用自身。
        2）在使用递增归策略时，必须有一个明确的递归结束条件，称为递归出口。
        3）递归算法解题通常显得很简洁，但递归算法解题的运行效率较低。所以一般不提倡用递归算法设计程序。
        4）在递归调用的过程当中系统为每一层的返回点、局部量等开辟了栈来存储。递归次数过多容易造成栈溢出等，所以一般不提倡用递归算法设计程序。
        在做递归算法的时候，一定要把握住出口，也就是做递归算法必须要有一个明确的递归结束条件。这一点是非常重要的。其实这个出口是非常好理解的，
        就是一个条件，当满足了这个条件的时候我们就不再递归了。
     */
    public static int partion(int[] data, int low, int high) {

        int index = data[low];//枢轴
        while (low < high) {
            while (low < high && data[high] >= index)
                high--;
            data[low] = data[high];
            while (low < high && data[low] <= index)
                low++;
            data[high] = data[low];
        }
        data[low] = index;
        return low;
    }

    public static void quikSort(int[] data, int left, int right) {
        if (left < right) {
            int pivot = partion(data, left, right);//将数组分为两部分
            quikSort(data, left, pivot - 1);//递归排序左子数组
            quikSort(data, pivot + 1, right);//递归排序右子数组
        }

    }

    public static void printData(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "  ");
        }
    }

    public static void main(String[] args) {
        int[] data = { 2, 3, 7, 5, 4, 9 };
        //        printData(bubbleSort(data));
        quikSort(data, 0, data.length - 1);
        printData(data);
    }
}
