package usantatecla.mastermind.views;

public enum MessageView {
    ATTEMPTS("#attempts attempt(s): "),
    SEPARATOR("-----------------------------------------------------"),
    SECRET("*"),
    RESUME("Do you want to continue"),
    RESULT(" --> #blacks blacks and #whites whites"),
    PROPOSED_COMBINATION("Propose a combination: "),
    ACTION_COMMAND("Do an action"),
    UNDO_COMMAND("Undo previous action"),
    REDO_COMMAND("Redo previous action"),
    TITLE("----- MASTERMIND -----"),
    WINNER("You've won!!! ;-)"),
    LOSER("You've lost... ;-(");

    private String message;

    private MessageView(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    void write() {
        System.out.print(this.message);
    }

    void writeln() {
        System.out.println(this.message);
    }

    void writeln(int attempts) {
        System.out.println(this.message.replaceAll("#attempts", "" + attempts));
    }

}
