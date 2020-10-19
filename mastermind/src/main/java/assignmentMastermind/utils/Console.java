package assignmentMastermind.utils;
import java.io.BufferedReader;
import java.io.InputStreamReader;

//////////////////////////////////////////////////////////////////////////
////CLASS COPIED FROM TEACHER'S SOLUTION TO SAVE SOME DEVELOPMENT TIME////
//////////////////////////////////////////////////////////////////////////

public class Console {

    public static Console console;
    
    public static Console instance() {
        if (Console.console == null) {
            Console.console = new Console();
        }
        return Console.console;
    }
    
    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public String readString(String title) {
        String input = null;
        this.write(title);
        try {
            input = this.bufferedReader.readLine();
        } catch (Exception ex) {
        }
        return input;
    }

    public String readString() {
        return this.readString("");
    }

    public void write(String string) {
        System.out.print(string);
    }
}