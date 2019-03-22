package com.tasks5.command;

public class EchoText implements Command {
    private String text;
    public EchoText(String text) {
        this.text = text;
    }

    @Override
    public void execute() {
        System.out.println(text);
    }
}
