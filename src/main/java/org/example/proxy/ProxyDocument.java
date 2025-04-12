package org.example.proxy;

public class ProxyDocument implements Document{
    private RealDocument realDocument;
    private String userRole;
    public ProxyDocument(String content, String userRole) {
        this.realDocument = new RealDocument(content);
        this.userRole = userRole;
    }
    @Override
    public void edit() {
        if ("admin".equals(userRole)) {
            realDocument.edit();
        } else {
            System.out.println("Access Denied: You do not have permission to edit this document.");
        }
    }
    @Override
    public void view() {
        realDocument.view();
    }
}
