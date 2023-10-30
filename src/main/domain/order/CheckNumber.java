package main.domain.order;

import java.util.regex.Pattern;

public class CheckNumber {
    private static final String NUMBER_REG = "^[0-9]*$"; // 36번줄 정규 표현식 => 주문 번호 입력
    public CheckNumber checkingInput(String input) throws IllegalArgumentException {
        if (!Pattern.matches(NUMBER_REG, input)) {
            throw new IllegalArgumentException("숫자를 입력해주세요");
        }
        return this;
    }
}
