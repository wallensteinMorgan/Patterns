package org.example.proxy;

public class Main {
    public static void main(String[] args) {
        Document adminDoc = new ProxyDocument("Confidential Document", "admin");
        Document userDoc = new ProxyDocument("Confidential Document", "user");

        adminDoc.edit();
        adminDoc.view();

        userDoc.edit();
        userDoc.view();
    }
}
