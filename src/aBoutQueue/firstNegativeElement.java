package aBoutQueue;

import java.util.Deque;
import java.util.LinkedList;

public class firstNegativeElement {

    static void firstNegativeElement(int[] arr, int n, int k) {
        Deque<Integer> dq = new LinkedList<>();

        // process first K elements - first window
        for (int index = 0; index < k; index++) {
            if (arr[index] < 0) {
                dq.addLast(index);
            }
        }

        // process remaining windows -> removal or addition
        for (int index = k; index < n; index++) {
            // answer of previous window
            if (dq.isEmpty()) {
                System.out.println("0");
            } else {
                System.out.println(arr[dq.peekFirst()]);
            }

            // removal -> remove out-of-window elements
            if (!dq.isEmpty() && index - dq.peekFirst() >= k) {
                dq.pollFirst();
            }

            // addition
            if (arr[index] < 0) {
                dq.addLast(index);
            }
        }

        // last window answer
        if (dq.isEmpty()) {
            System.out.println("0");
        } else {
            System.out.println(arr[dq.peekFirst()]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, -5, 4, -1, -2, 0, 5};
        int n = arr.length;
        int k = 3;
        firstNegativeElement(arr, n, k);
    }
}
