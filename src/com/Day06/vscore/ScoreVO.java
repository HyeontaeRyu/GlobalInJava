package com.Day06.vscore;

public class ScoreVO {
    private String hak, name, birth;
    private int kor, eng, mat, tot;

    public int getTot() {
        return tot;
    }

    public void setTot(int tot) {
        this.tot = tot;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHak() {
        return hak;
    }

    public void setHak(String hak) {
        this.hak = hak;
    }

    @Override
    public String toString() {
        return String.format("%7s%10s%5d%5d%5d%5d%6.1f", hak, name, kor, eng, mat, getTot(), (float) getTot() / 3);

    }
}
