package org.example.chainOfResponsibility;

public class UserIdHandler implements PinHandler{
    @Override
    public void setNext(PinHandler handler) {
        if (handler != null) {
            throw new UnsupportedOperationException("UserIdHandler is the last handler in the chain and cannot have a next handler.");
        }
    }
    @Override
    public String findPin(String cmsId, String cif, String id) {
        if (id != null) {
            if (id.equals("abcdef")) {
                return "4SSS3EE";
            }
        }
        return null;
    }

}
