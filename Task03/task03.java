// 3. Реализовать алгоритм пирамидальной сортировки (HeapSort).

package Task03;

import java.util.Arrays;
import java.util.Random;

public class task03 {
    public static void main (String[] args) {

        int[] checkingArray = createRandArray();
        System.out.println("\nСоздаём случайный массив: ");
        System.out.println(Arrays.toString(checkingArray));
        System.out.println("\nМассив после сортировки: ");
        heapSort(checkingArray, checkingArray.length);

    }


    public static int[] createRandArray() {
        int[] arr = new int[28];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int n = random.nextInt(100) - 55;
            arr[i] = n;
        }
        return arr;
    }

    public static void heapSort (int[] array, int length) {
        int temp;
        int size = length - 1;
        for (int i = (length / 2); i >= 0; i--) {
            heapSortProcess(array, i, size);
        }
        for (int i = size; i >= 0; i--) {
            temp = array[0];
            array[0] = array[size];
            array[size] = temp;
            size--;
            heapSortProcess(array, 0, size);
        }
        System.out.println(Arrays.toString(array));
    }

    public static void heapSortProcess (int[] array, int top, int heapSize) {
        int left = 2 * top + 1;
        int right = 2 * top + 2;
        int largestElement;
        if (left <= heapSize && array[left] > array[top]) {
            largestElement = left;
        } else {
            largestElement = top;
        }
        if (right <= heapSize && array[right] > array[largestElement]) {
            largestElement = right;
        }
        if (largestElement != top) {
            int temp = array[top];
            array[top] = array[largestElement];
            array[largestElement] = temp;
            heapSortProcess(array, largestElement, heapSize);
        }
    }
}