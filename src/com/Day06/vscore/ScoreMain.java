package com.Day06.vscore;

import java.io.IOException;

public class ScoreMain {
    public static void main(String[] args) throws IOException {
        char ch;
        Score s = new ScoreImpl();

        while (true) {
            do {
                System.out.println("1.추가 2.수정 3.삭제 4.전체출력 5.학번검색 6.이름검색 7.종료 =>");
                ch = (char) System.in.read();
                System.in.skip(2);

            } while (ch < '1' || ch > '7');

            switch (ch) {
                case '1':
                    s.insert();
                    break;
                case '2':
                    s.update();
                    break;
                case '3':
                    s.delete();
                    break;
                case '4':
                    s.listAll();
                    break;
                case '5':
                    s.searchHak();
                    break;
                case '6':
                    s.searchName();
                    break;
                case '7':
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                    break;
                default:
                    break;
            }

        }
    }
}
