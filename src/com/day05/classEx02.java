package com.day05;

class Salary {
    private int pay;
    private int pass;

    public void setPass(int pass) {
        this.pass = pass;
    }

    public int getPay() {

        return pay;
    }

    public void setPay(int pay, int pass) {
        if (this.pass == 0) {
            System.out.println("비밀번호를 먼저 설정해주세요.");
            return;
        }
        if (pass == this.pass) {
            this.pay = pay;
        } else {
            System.out.println("비밀번호가 틀렸습니다.");
        }
    }
}

public class classEx02 {

    public static void main(String[] args) {

        Salary s = new Salary();
        s.setPass(1234);
        s.setPay(1000, 1234);
        System.out.println(s.getPay());
    }

}
