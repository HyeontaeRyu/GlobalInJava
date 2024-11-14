package com.day07.ascore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl implements Score {

    private final List<ScoreVO> list = new ArrayList<ScoreVO>();
    private final Scanner sc = new Scanner(System.in);

    @Override
    public void insert() {
        System.out.println("\n 자료 추가 ............");
        String hak;

        System.out.print("학번 입력 : ");
        hak = sc.next();
        ScoreVO temp = readScore(hak);
        if (temp != null) {
            System.out.println("이미 등록된 학번입니다.");
            return;
        }
        ScoreVO vo = new ScoreVO();
        vo.setHak(hak);

        System.out.print("이름 입력 : ");
        vo.setName(sc.next());

        System.out.print("생년월일 입력 : ");
        vo.setBirth(sc.next());

        System.out.print("국어 점수 입력 : ");
        vo.setKor(sc.nextInt());

        System.out.print("영어 점수 입력 : ");
        vo.setEng(sc.nextInt());

        System.out.print("수학 점수 입력 : ");
        vo.setMat(sc.nextInt());

        vo.setTot(vo.getKor() + vo.getEng() + vo.getMat());
        list.add(vo);

        System.out.println("자료 추가 완료");

    }

    @Override
    public void update() {
        System.out.println("\n 자료 수정 ............");
        System.out.print("학번 입력 : ");
        String hak = sc.next();
        ScoreVO vo = readScore(hak);
        if (vo == null) {
            System.out.println("등록되지 않은 학번입니다.");
            return;
        }
        System.out.print("이름 입력 : ");
        vo.setName(sc.next());
        System.out.print("생년월일 입력 : ");
        vo.setBirth(sc.next());
        System.out.print("국어 점수 입력 : ");
        vo.setKor(sc.nextInt());
        System.out.print("영어 점수 입력 : ");
        vo.setEng(sc.nextInt());
        System.out.print("수학 점수 입력 : ");
        vo.setMat(sc.nextInt());
        vo.setTot(vo.getKor() + vo.getEng() + vo.getMat());
        System.out.println("자료 수정 완료");

    }

    @Override
    public void listAll() {
        System.out.println("\n 전체 자료 출력 ............");
        for (ScoreVO vo : list) {
            System.out.println(vo);
        }
        System.out.println("전체 인원 : " + list.size() + "명");

    }

    @Override
    public void delete() {
        System.out.println("\n 자료 삭제 ............");
        System.out.print("학번 입력 : ");
        String hak = sc.next();
        ScoreVO vo = readScore(hak);
        if (vo == null) {
            System.out.println("등록되지 않은 학번입니다.");
            return;
        }
        list.remove(vo);
        System.out.println("자료 삭제 완료");

    }

    @Override
    public void searchHak() {
        System.out.println("\n 학번 검색 ............");
        System.out.print("학번 입력 : ");
        String hak = sc.next();
        ScoreVO vo = readScore(hak);
        if (vo == null) {
            System.out.println("등록되지 않은 학번입니다.");
            return;
        }
        System.out.println(vo);
    }

    @Override
    public void searchName() {
        System.out.println("\n 이름 검색 ............");
        System.out.print("이름 입력 : ");
        String name = sc.next();
        int count = 0;
        for (ScoreVO vo : list) {
            if (vo.getName().equals(name)) {
                System.out.println(vo);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("등록되지 않은 이름입니다.");
        }

    }

    public ScoreVO readScore(String hak) {
        for (ScoreVO vo : list) {
            if (vo.getHak().equals(hak)) {
                return vo;
            }
        }
        return null;
    }

}
