package org.example.chainOfResponsibility;

public class ClientIdHandler implements PinHandler{
    private PinHandler nextHandler;
    @Override
    public void setNext(PinHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public String findPin(String clientId, String accountId, String userId) {
        if(clientId != null) {
            if(clientId.equals("12345")){
                return "4SSSS3EE";
            }
        }
        if(nextHandler != null){
            return nextHandler.findPin(clientId, accountId, userId);
        }
        return null;
    }
}
