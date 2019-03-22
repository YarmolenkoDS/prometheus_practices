package com.tasks5.command;

public class Application {
    public static void main(String[] args){
        //System.out.println(args.length);
        //System.out.println();
        /*for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }*/



        if (args == null || args.length == 0)  {
            System.out.println("Error");

        } else {
            if (args.length == 1 && args[0].equals("help")) {
                Command command = new Help();
                command.execute();
            } else if (args.length == 1 && args[0].equals("exit")) {
                Command command = new Exit();
                command.execute();
            } else if (args.length == 2 && args[0].equals("echo")) {
                Command command = new EchoText(args[1]);
                command.execute();
            } else if (args.length == 2 && (args[0] + " " + args[1]).equals("date now")) {
                Command command = new DateNow();
                command.execute();
            } else {
                System.out.println("Error");
            }
        }
    }
}