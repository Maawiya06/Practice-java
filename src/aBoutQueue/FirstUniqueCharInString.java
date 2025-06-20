package aBoutQueue;

import java.util.LinkedList;
import java.util.Queue;

public class FirstUniqueCharInString {
    public static void main(String args[]) {
        String str = "facfdcad";
        Queue<Character> q = new LinkedList<>();
        int[] freq = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch - 'a']++;
            q.add(ch);

            // answer find kro
            while (!q.isEmpty()) {
                char frontCharacter = q.peek();
                if (freq[frontCharacter - 'a'] > 1) {
                    // y answe nhi h
                    q.poll();
                } else {
                    // ==1 wala case
                    // yhi answer h
                    System.out.println(frontCharacter);
                    break;
                }
            }

            if (q.isEmpty()) {
                // puri Queue khali h
                System.out.println("#");
            }
        }
    }
}
