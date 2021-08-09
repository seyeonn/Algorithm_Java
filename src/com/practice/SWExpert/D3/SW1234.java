package com.practice.SWExpert.D3;

import java.util.ArrayList;
import java.util.Scanner;
// 비밀번호
public class SW1234 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int t = 0; t < 10; t++) {
            int N = scan.nextInt();
            String s = scan.next();

            ArrayList<Integer> list = new ArrayList<Integer>();

            for (int i = 0; i < s.length(); i++) {
                list.add(s.charAt(i)-'0');
            }

            for (int i = 0; i < list.size(); i++) {
                for (int j = 1; j < list.size(); j++) {
                    if(list.get(j) == list.get(j-1)) {
                        list.remove(j);
                        list.remove(j-1);
                    }
                }
            }


            String ans = "";

            for (int i = 0; i < list.size(); i++) {
                ans += Integer.toString(list.get(i));
            }

            System.out.printf("#%d %s \n", (t+1), ans);

        }
    }
}
