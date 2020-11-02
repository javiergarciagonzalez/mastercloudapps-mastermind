package usantatecla.mastermind.distributed;

import usantatecla.mastermind.distributed.dispatchers.DispatcherPrototype;

public class MastermindServer {

    private DispatcherPrototype dispatcherPrototype;

    private LogicImplementationServer logic;

    private MastermindServer() {
        this.dispatcherPrototype = new DispatcherPrototype();
        this.logic = new LogicImplementationServer();
        this.logic.createDispatchers(this.dispatcherPrototype); // TODO: Esta linea no le gusta a Luis.
    }

    private void serve() {
        this.dispatcherPrototype.serve();
    }

    public static void main(String[] args) {
        new MastermindServer().serve();
    }

}
