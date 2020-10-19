package assignmentMastermind.utils;

public class Logger {
    
    public static Logger logger;

    public static void write(String text) {
        System.out.println(text);
    }

    public static void writeMessage(Messages message) {
        System.out.println(message.text);
    }
}
