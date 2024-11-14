package com.day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class arrEx05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name = "";
        int[] jumin = new int[14];

        boolean right = false;

        System.out.print("이름 입력 :");
        name = br.readLine();

        do {
            right = false;
            System.out.print("주민번호 입력(111111-1111111)");
            for (int i = 0; i < jumin.length; i++) {
                jumin[i] = System.in.read() - 48;

            }
            /*
            System.in.read(); // \r
            System.in.read(); // \n
*/
            System.in.skip(2);


            // 월의 범위
            if (jumin[2] * 10 + jumin[3] > 12) {
                System.out.println("태어난 달은 12월보다 클수 없습니다.");
                continue;


                // 일의 범위
            } else if (jumin[4] * 10 + jumin[5] > 31) {
                System.out.println("태어난 일은 31보다 클수 없습니다.");
                continue;


                //성별
            } else if (jumin[7] != 9 && jumin[7] != 0 && jumin[7] != 1
                    && jumin[7] != 2 && jumin[7] != 3 && jumin[7] != 4) {

                System.out.println("성별을 나타내는 숫자는 9,0,1,2,3,4 중 하나 이어야 합니다.");
                continue;

            }

            int hap = 0;
            int cre = 2;

            float temp = 0.0f, temp1 = 0.0f;

            // 123456 - a b c d e f g
            // a: 9,0,1,2,3,4 --> 성별
            // b: 0~9         --> 지역
            // c~d: 시도의 구
            // e~f: 동, 읍, 면을 표시
            // g: 판별공식
            // 마지막 판별인 g와 같으면 주민번호 숫자가 올바르게 되었다고 봄
            /*
             hap = 0;
             hap += 주민번호 첫번쨰 자리(1) * 2
             hap += 주민번호 두번쨰 자리(2) * 3
             hap += 주민번호 세번쨰 자리(3) * 4
             hap += 주민번호 네번쨰 자리(4) * 5
             hap += 주민번호 디섯번쨰 자리(5) * 6
             hap += 주민번호 여섯번쨰 자리(6) * 7

             - : 계산에서 제외함
             hap += 주민번호 여덟번째 자리(a) * 8
             hap += 주민번호 아홉번째 자리(b) * 9
             hap += 주민번호 열번째 자리(c) * 2
             hap += 주민번호 열번째 자리(d) * 3
             hap += 주민번호 열번째 자리(e) * 4
             hap += 주민번호 열번째 자리(f) * 5

             temp =(int)(hap/11.0f) * 11.0f + 11.0f - hap;
             temp1 = temp - (int)(temp /10.0f) *10.0f

             */
            for (int i = 0; i < jumin.length - 1; i++) {

                if (i == 6) {
                    continue;
                }
                hap += jumin[i] * cre;
                cre++;

                if (cre == 10) {
                    cre = 2;
                }

            }
            temp = (int) (hap / 11.0f) * 11.0f + 11.0f - hap;
            temp1 = temp - (int) (temp / 10.0f) * 10.0f;

            if (temp1 != jumin[13]) {
                System.out.println("주민번호 검증 수가 올바르지 않습니다");
                continue;
            }


            right = true;
        } while (!right);

        System.out.println();
        System.out.println("이름 : " + name);
        System.out.print("주민번호 :");
        for (int i = 0; i < jumin.length; i++) {
            if (i == 6) {
                System.out.print("-");
                continue;
            }
            System.out.print(jumin[i]);
        }//배열에 저장된 주민번호 출력
        System.out.println();
        System.out.print("성년월일 :");
        int year = 0, month = 0;
        int day = 0;

        switch (jumin[7]) {
            case 9:
            case 0:
                year = 1800;
                break;

            case 1:
            case 2:
                year = 1900;
                break;

            case 3:
            case 4:
                year = 2000;
                break;
        }

        year += jumin[0] * 10 + jumin[1];
        month = jumin[2] * 10 + jumin[3];
        day = jumin[5] * 10 + jumin[5];

        System.out.println(year + "년" + month + "월" + day + "일");
        System.out.print("성별:");
        System.out.println(jumin[7] % 2 == 0 ? "여성" : "남성");
        System.out.println("태어난 시도 : ");
        String area = "";

        switch (jumin[8]) {
            case 0:
                area = "서울";
                break;

            case 1:
                area = "경기,인천";
                break;

            case 2:
                area = "부산";
                break;

            case 3:
                area = "강원도";
                break;

            case 4:
                area = "충청도";
                break;

            case 5:
                area = "전라도";
                break;

            case 6:
                area = "대구 광주";
                break;

            case 7:
                area = "경북,경남";
                break;

            case 8:
                area = "경남";
                break;

            case 9:
                area = "제주도";
                break;
        }
        System.out.println(area);
        System.out.print("나이:");
        Calendar ca = Calendar.getInstance();
        int age = ca.get(Calendar.YEAR) - year + 1;
        System.out.print(age);
        System.out.println("세");


    }

}
