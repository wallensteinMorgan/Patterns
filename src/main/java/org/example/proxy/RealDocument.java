package org.example.proxy;

public class RealDocument implements Document{
    private String content;
    public RealDocument(String content) {
        this.content = content;
    }
    @Override
    public void edit() {
        System.out.println("Editing document: " + content);
    }

    @Override
    public void view() {
        System.out.println("Viewing document: " + content);
    }
}
