package com.Day06.vscore;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class ScoreImpl implements Score {

    private final Scanner sc = new Scanner(System.in);
    private final Vector<ScoreVO> list = new Vector<>();

    @Override
    public void insert() {
        System.out.println("\n 자료 추가 ............");
        String hak;

        System.out.println("학번 입력 : ");
        hak = sc.next();
        ScoreVO temp = readScore(hak);
        if (temp != null) {
            System.out.println("이미 등록된 학번입니다.");
            return;
        }
        ScoreVO vo = new ScoreVO();
        vo.setHak(hak);

        System.out.println("이름 입력 : ");
        vo.setName(sc.next());

        System.out.println("생년월일 입력 : ");
        vo.setBirth(sc.next());

        System.out.println("국어 점수 입력 : ");
        vo.setKor(sc.nextInt());

        System.out.println("영어 점수 입력 : ");
        vo.setEng(sc.nextInt());

        System.out.println("수학 점수 입력 : ");
        vo.setMat(sc.nextInt());

        vo.setTot(vo.getKor() + vo.getEng() + vo.getMat());
        list.add(vo);

        System.out.println("자료 추가 완료");

    }

    @Override
    public void update() {

    }

    @Override
    public void listAll() {
        System.out.println("\n 전체 자료 출력 ............");
        System.out.println("학번\t이름\t생년월일\t국어\t영어\t수학\t총점");

        Iterator<ScoreVO> it = list.iterator();
        while (it.hasNext()) {
            ScoreVO v = it.next();
        }
    }

    @Override
    public void delete() {

    }

    @Override
    public void searchHak() {

    }

    @Override
    public void searchName() {

    }

    public ScoreVO readScore(String hak) {
        ScoreVO vo = null;
        for (ScoreVO v : list) {
            if (v.getHak().equals(hak)) {
                vo = v;
                break;
            }
        }
        return vo;
    }
}
