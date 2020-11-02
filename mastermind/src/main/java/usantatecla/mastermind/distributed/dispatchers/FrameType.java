package usantatecla.mastermind.distributed.dispatchers;

public enum FrameType {
    START,
    ATTEMPTS,
    STATE,
    UNDO,
    REDO,
    UNDOABLE,
    REDOABLE,
    CLOSE,
    WINNER,
    LOSER,
    BLACKS,
    WHITES,
    ADD_PROPOSED_COMBINATION,
    GET_WIDTH,
    GET_COLORS,
    NEW_GAME;

    public static FrameType parser(String string) {
        for(FrameType frameType : FrameType.values()) {
            if (frameType.name().equals(string)) {
                return frameType;
            }
        }
        return null;
    }
}
