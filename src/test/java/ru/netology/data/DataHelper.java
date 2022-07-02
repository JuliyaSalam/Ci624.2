package ru.netology.data;

import lombok.Value;

public class DataHelper {
    @Value
    public static class AuthInfo {
        private String login;
        private String password;

    }

    public static AuthInfo getAuthInfo() {
        return new AuthInfo("vasya", "qwerty123");
    }

    public static AuthInfo getOtherAuthInfo(AuthInfo original) {
        return new AuthInfo("petya", "123qwerty");
    }

    @Value
    public static class VerificationCode {
        private String code;
    }

    public static VerificationCode getVerificationCodeFor(AuthInfo authInfo) {
        return new VerificationCode("12345");
    }

    @Value
    public static class GetCard {
        private String card;
    }

    public static String getCard(int index) {
        String[] cards = new String[]{"5559 0000 0000 0001", "5559 0000 0000 0002"};
        String card = cards[index];
        return card;
    }


}
