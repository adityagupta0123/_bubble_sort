package Loops;

import java.util.Scanner;

public class IsAnagramOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        boolean isAnagram = true;
        boolean visted[] = new boolean[b.length()];

        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                isAnagram = false;

                for (int j = 0; j < b.length(); j++) {
                    if (b.charAt(j) == a.charAt(i) && visted[j]) {
                        visted[j] = true;
                        isAnagram = true;
                        break;
                    }
                }
                if (!isAnagram) {
                    break;
                }
            }
        }
        if (isAnagram) {
            System.out.println("anagram");
        } else {
            System.out.println("not anagram");
        }
    }
}

