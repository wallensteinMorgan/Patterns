package org.example.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        PinHandler clientIdHandler = new ClientIdHandler();
        PinHandler accountIdHandler = new AccountIdHandler();
        PinHandler userIdHandler = new UserIdHandler();

        clientIdHandler.setNext(accountIdHandler);
        accountIdHandler.setNext(userIdHandler);

        String clientId = null;
        String accountId = null;
        String userId = null;

        String pin = clientIdHandler.findPin(clientId, accountId, userId);
         if(pin!= null) {
             System.out.println("Found pin " + pin);
         }else  {
             System.out.println("Pin not found");
         }
    }
}