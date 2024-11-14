package com.task.task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Seat {
    private final char seatRank;
    private final List<String> seats = new ArrayList<>(10);
    private final HashMap<String, Integer> seatMap = new HashMap<>(10);

    public Seat(char seatRank) {
        this.seatRank = seatRank;
        for (int i = 0; i < 10; i++) {
            seats.add("---");
        }
    }

    public char getSeatRank() {
        return seatRank;
    }

    public void reserve(String name, int seatNumber) {
        if (name.equals("---") || seatMap.containsKey(name) || seatMap.containsValue(seatNumber) || seatNumber < 1 || seatNumber > 10) {
            System.out.println("예약되거나 올바르지 않은 이름 또는 좌석 번호");
            return;
        }
        seats.set(seatNumber - 1, name);
        seatMap.put(name, seatNumber);
    }

    public void cancel(String name) {
        if (!seatMap.containsKey(name) || name.equals("---")) {
            System.out.println("올바르지 않거나 중복된 이름");
            return;
        }
        int seatNumber = seatMap.get(name);
        seats.set(seatNumber - 1, "---");
        seatMap.remove(name);
    }

    @Override
    public String toString() {
        StringBuilder strB = new StringBuilder(seatRank + " : ");
        for (String seat : seats) {
            strB.append(seat).append(" ");
        }
        return strB.toString();
    }

    public boolean isDuplicate(String name) {
        return seatMap.containsKey(name);
    }

    public boolean isReserved(int seatNumber) {
        return seatMap.containsValue(seatNumber);
    }
}