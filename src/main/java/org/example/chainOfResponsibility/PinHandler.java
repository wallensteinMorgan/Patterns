package org.example.chainOfResponsibility;

public interface PinHandler {
    void setNext(PinHandler handler);
    String findPin(String clientId, String accountId, String userId);
}
