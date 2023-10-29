package main.kiosk;

public enum KioskOption {
    WAITING_ORDERS(1, "대기주문 목록"),
    COMPLETED_ORDERS(2, "완료주문 목록"),
    CREATE_MENU(3, "상품 생성"),
    REMOVE_MENU(4, "상품 삭제");

    int seq;

    String text;

    KioskOption(int seq, String text) {
        this.seq = seq;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public int getSeq() {
        return seq;
    }
}
