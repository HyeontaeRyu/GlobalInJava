package com.Task;

/*프로그램 종류
  - 글로벌 인 콘서트 예약프로그램

예약 프로그램을 기능은 다음과 같다.

   1. 공연은 하루에 한번 있다.
        2. 좌석은 S석, A석, B석으로 나뉘며, 각각 10개의 좌석이 있다.
   3. 예약 프로그램을 메뉴는 "예약", "조회", "취소", "종료" 가 있다.
        4. 예약은 한자리만 가능하고, 좌석타입, 예약자 이름, 좌석 번호를 순서대로 입력받아 예약한다.
        5. 조회는 모든 좌석을 출력해야함
   6. 취소는 예약자의 이름을 입력받아 취소를 진행한다.
        7. 없는 이름, 없는 번호, 없는 메뉴, 잘못된 취소 등에 대해서 오류 메시지를 출력하고
다시 입력 할 수있도록 한다.

        출력

글로벌 인 콘서트 예약프로그램
예약:1, 조회:2, 취소:3, 종료:4  => 1
좌석구분 S(1), A(2), B(3) => 1
S : --- --- --- --- --- --- --- --- --- ---  현재 S석 상태
       1   2   3   4   5   6   7   8   9   10
이름 : 가길동
번호 : 1

좌석구분 S(1), A(2), B(3) => 2
A : --- --- --- --- --- --- --- --- --- ---  현재 A석 상태
        1   2   3   4   5   6   7   8   9   10
이름 : 나길동
번호 : 5
        --------------------------- 예약  ------------------------------------
예약:1, 조회:2, 취소:3, 종료:4  => 2
S : 가길동 --- --- --- --- --- --- --- --- ---
A : --- --- --- --- 나길동 --- --- --- --- ---
B : --- --- --- --- --- --- --- --- --- --- ---    예약된 모든 좌석 조회

  >>>>>>>>>>  조회를 완료 하였습니다.    <<<<<<<<<<<<

예약:1, 조회:2, 취소:3, 종료:4  => 3
좌석 S:1,  A:2,   B:3  >> 2
A : --- --- --- --- 나길동 --- --- --- --- ---
이름 : 나길동

예약:1, 조회:2, 취소:3, 종료:4  => 2
S : 가길동 --- --- --- --- --- --- --- --- ---
A : --- --- --- --- --- --- --- --- --- --- ---
B : --- --- --- --- --- --- --- --- --- --- ---   나길동의 예약이 취소된 상
   >>>>>>>>>>  조회를 완료 하였습니다.    <<<<<<<<<<<<

예약:1, 조회:2, 취소:3, 종료:4  => 4*/

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

class reservation {
    public char seatRank;
    public String[] seat = new String[10];

    public reservation(char seatRank) {
        this.seatRank = seatRank;
        Arrays.fill(seat, "---");
    }

    public void doReservation(String name, int num) {
        boolean isDuplication = false;
        for (String s : seat) {
            isDuplication = Objects.equals(s, name);
            if (isDuplication) {
                System.out.println("같은 이름으로 예약된 좌석이 있습니다.");
                return;
            }
        }
        seat[num - 1] = name;
    }

    public void cancel(String name) {
        for (int i = 0; i < seat.length; i++) {
            if (Objects.equals(seat[i], name)) {
                seat[i] = "---";
                return;
            }
        }
        System.out.println("예약된 이름이 없습니다.");
    }

    public void printSeat() {
        System.out.printf(seatRank + " : ");
        for (String s : seat) {
            System.out.print(s + " ");
        }
    }
}


public class task3 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int num2 = 0;
        String name = "";
        reservation[] r = new reservation[3];
        r[0] = new reservation('S');
        r[1] = new reservation('A');
        r[2] = new reservation('B');

        do {
            System.out.println("글로벌 인 콘서트 예약프로그램");
            System.out.println("예약:1, 조회:2, 취소:3, 종료:4  => ");
            try {
                num = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해 주세요.");
                continue;
            }

            switch (num) {
                case 1:
                    System.out.println("좌석 S:1, A:2, B:3  >> ");
                    num = sc.nextInt();

                    r[num - 1].printSeat();
                    System.out.printf("   현재 %c석 상태\n", r[num - 1].seatRank);
                    System.out.println("       1   2   3   4   5   6   7   8   9   10");
                    System.out.println("이름 : ");
                    name = sc.next();

                    System.out.println("번호 : ");
                    try {
                        num2 = sc.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("숫자를 입력해 주세요.");
                        break;
                    }

                    r[num - 1].doReservation(name, num2);
                    break;
                case 2:
                    for (reservation res : r) {
                        res.printSeat();
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("좌석 S:1, A:2, B:3  >> ");
                    num = sc.nextInt();
                    r[num - 1].printSeat();
                    System.out.println();

                    System.out.println("이름 : ");
                    name = sc.next();
                    r[num - 1].cancel(name);

                    break;
                case 4:
                    return;
                default:
                    System.out.println("올바른 번호를 입력하세요.");
            }
            num2 = 0;
            name = "";
            num = 0;
        } while (true);

    }
}
