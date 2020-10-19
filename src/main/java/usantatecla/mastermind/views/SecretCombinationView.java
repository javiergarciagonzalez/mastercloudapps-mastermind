package usantatecla.mastermind.views;

import java.util.ArrayList;

import usantatecla.mastermind.models.Color;

public class SecretCombinationView extends ConsoleView {
    
    private ArrayList<Color> colors;
    
    SecretCombinationView() {
        super();
        this.colors = new ArrayList<Color>();
    }

    
    void writeln() {
        this.console.write("**** - ");
        for (Color color : this.colors) {
            color.write();
        }
        this.console.writeln();
    }
}
