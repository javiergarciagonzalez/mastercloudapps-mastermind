package usantatecla.mastermind.views;

import usantatecla.mastermind.models.Color;
import usantatecla.mastermind.models.Error;
import usantatecla.mastermind.models.ProposedCombination;

public class ProposedCombinationView extends ConsoleView {
    
    private ProposedCombination proposedCombination;
    
    ProposedCombinationView() {
        super();
        this.proposedCombination = new ProposedCombination();
    }

    void write() {
        for (ColorView color : this.proposedCombination.getColors()) {
            color.write();
        }
    }

    void read() {
        ErrorView error;
        do {
            MessageView.PROPOSED_COMBINATION.write();
            error = this.checkError(this.console.instance().readString());
            error.writeln();
            if (!error.isNull()) {
                this.colors = new ArrayList<Color>();
            }
        } while (!error.isNull());
    }

}
