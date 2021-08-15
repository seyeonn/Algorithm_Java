package com.practice.SWExpert.D3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SW1213 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        for (int t = 0; t < 10; t++) {

            int T = scan.nextInt();

            String find = scan.next();
            String str = scan.next();
            String[] s = str.split(find);

            // 참고 : StringTokenizer(s, find)
            // -> ti로 줬을 경우 t의 경우와 i의 경우를 다 센다.
            // split으로 해야 해당 문자열의 경우만 구함.

            int count = s.length-1;

            // 마지막으로 나오는 문자가 find를 같으면 split으로 끝나기 때문에 +1을 해주어야 한다.
            // subString메소드를 이용하여 find의 갯수만큼 잘라 find를 포함하고 있는지 확인 후 결과값에 +1을 해주었다.
            if(str.substring(str.length()-find.length(), str.length()).contains(find)){
                count++;
            }
            System.out.printf("#%d %d \n", T, count);
        }
    }
}
