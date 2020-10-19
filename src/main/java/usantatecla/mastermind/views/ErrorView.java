package usantatecla.mastermind.views;

import usantatecla.mastermind.models.Error;

//////////////////////////////////////////////////////////////////////////
////CLASS COPIED FROM TEACHER'S SOLUTION TO SAVE SOME DEVELOPMENT TIME////
//////////////////////////////////////////////////////////////////////////

class ErrorView extends ConsoleView {

    private static final String[] MESSAGES = { 
            "Repeated colors",
            "Wrong colors, they must be: " + ColorView.allInitials(), 
            "Wrong proposed combination length" };

    private Error error;

    ErrorView(Error error) {
        this.error = error;
    }
    
    void writeln() {
        this.console.writeln(ErrorView.MESSAGES[this.error.ordinal()]);
    }

}
