package org.example.chainOfResponsibility;

public class UserIdHandler implements PinHandler{
    @Override
    public void setNext(PinHandler handler) {
        // Last next method
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
