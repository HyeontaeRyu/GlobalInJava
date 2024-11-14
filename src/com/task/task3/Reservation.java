package com.task.task3;

public class Reservation {
    private final Group group = new Group();

    public void run() {
        while (true) {
            System.out.println("글로벌 인 콘서트 예약 프로그램");
            System.out.print("예약 : 1, 조회 : 2, 취소 : 3, 종료 : 4 => ");
            int choice = ScannerUtil.getNextInt();
            switch (choice) {
                case 1:
                    reserve();
                    break;
                case 2:
                    search();
                    break;
                case 3:
                    cancel();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("올바른 메뉴를 선택해주세요.");
                    break;
            }
        }
    }

    private void reserve() {
        while (true) {
            System.out.println("-------좌석 예매-------");
            System.out.print("좌석구분 S(1), A(2), B(3), 취소(4) => ");
            int choice = ScannerUtil.getNextInt();
            switch (choice) {
                case 1:
                    group.reserve('S');
                    break;
                case 2:
                    group.reserve('A');
                    break;
                case 3:
                    group.reserve('B');
                    break;
                case 4:
                    return;
                default:
                    System.out.println("올바른 메뉴를 선택해주세요.");
                    break;
            }
        }
    }

    private void search() {
        group.show();
        System.out.print("\n>>>>>>>>>>  조회를 완료하였습니다.  <<<<<<<<<<<<\n");
    }

    private void cancel() {
        while (true) {
            System.out.println("-------  예매 취소  -------");
            System.out.print("좌석구분 S(1), A(2), B(3), 취소(4) => ");
            int choice = ScannerUtil.getNextInt();
            switch (choice) {
                case 1:
                    group.cancel('S');
                    break;
                case 2:
                    group.cancel('A');
                    break;
                case 3:
                    group.cancel('B');
                    break;
                case 4:
                    return;
                default:
                    System.out.println("올바른 메뉴를 선택해주세요.");
                    break;
            }
        }
    }
}