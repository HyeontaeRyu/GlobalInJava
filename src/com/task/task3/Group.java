package com.task.task3;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private final List<Seat> seats = new ArrayList<>(3);

    public Group() {
        addSeat(new Seat('S'));
        addSeat(new Seat('A'));
        addSeat(new Seat('B'));
    }

    public void addSeat(Seat seat) {
        seats.add(seat);
    }

    public void show() {
        for (Seat seat : seats) {
            System.out.println(seat);
        }
    }

    public void reserve(char seatRank) {
        Seat seat = findSeatByRank(seatRank);
        if (seat != null) {
            String name = getValidName(seat);
            if (name == null) {
                System.out.println("예약이 취소되었습니다.");
                return;
            }
            int seatNumber = getValidSeatNumber(seat);
            if (seatNumber == -1) {
                System.out.println("예약이 취소되었습니다.");
                return;
            }
            seat.reserve(name, seatNumber);
            System.out.printf("%c석 %s님의 예약이 완료되었습니다.\n", seatRank, name);
        }
    }

    public void cancel(char seatRank) {
        Seat seat = findSeatByRank(seatRank);
        if (seat != null) {
            String name = getValidNameForCancellation(seat);
            if (name == null) {
                System.out.println("취소가 취소되었습니다.");
                return;
            }
            seat.cancel(name);
            System.out.printf("%c석 %s님의 예약이 취소되었습니다.\n", seatRank, name);
        }
    }

    private Seat findSeatByRank(char seatRank) {
        for (Seat seat : seats) {
            if (seat.getSeatRank() == seatRank) {
                return seat;
            }
        }
        System.out.println("올바른 좌석 등급을 입력 해 주세요.");
        return null;
    }

    private String getValidName(Seat seat) {
        while (true) {
            System.out.print("이름 : ");
            String name = ScannerUtil.SCANNER.next();
            if (name != null && !name.equals("---") && !seat.isDuplicate(name)) {
                return name;
            }
            System.out.println("올바르지 않거나 중복된 이름입니다. 다시 입력하시겠습니까? (y/n)");
            if (!getYesOrNo()) {
                return null;
            }
        }
    }

    private int getValidSeatNumber(Seat seat) {
        while (true) {
            System.out.print("번호 : ");
            int seatNumber = ScannerUtil.getNextInt();
            if (seatNumber >= 1 && seatNumber <= 10 && !seat.isReserved(seatNumber)) {
                return seatNumber;
            }
            System.out.println("올바르지 않거나 이미 예약된 번호입니다. 다시 입력하시겠습니까? (y/n)");
            if (!getYesOrNo()) {
                return -1;
            }
        }
    }

    private String getValidNameForCancellation(Seat seat) {
        while (true) {
            System.out.print("이름 : ");
            String name = ScannerUtil.SCANNER.next();
            if (name != null && seat.isDuplicate(name) && !name.equals("---")) {
                return name;
            }
            System.out.println("올바르지 않거나 예약되지 않은 이름입니다. 다시 입력하시겠습니까? (y/n)");
            if (!getYesOrNo()) {
                return null;
            }
        }
    }

    private boolean getYesOrNo() {
        while (true) {
            char c = ScannerUtil.getNextChar();
            if (c == 'y' || c == 'Y') {
                return true;
            } else if (c == 'n' || c == 'N') {
                return false;
            } else {
                System.out.println("잘못된 입력입니다. y 또는 n을 입력하세요.");
            }
        }
    }
}