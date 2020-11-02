package usantatecla.mastermind.distributed.dispatchers;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import usantatecla.mastermind.types.Color;
// import usantatecla.mastermind.types.PlayerType;
import usantatecla.mastermind.types.Error;

public class TCPIP extends usantatecla.utils.TCPIP { // TODO: A luis no le gusta q TCPIP extienda del utils

    public static TCPIP createClientSocket() {
        try {
            Socket socket = new Socket("localhost", 2020);
            System.out.println("Cliente> Conexion establecida");
            return new TCPIP(socket);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static TCPIP createServerSocket() {
        try {
            ServerSocket serverSocket = new ServerSocket(2020);
            System.out.println("Servidor> Esperando conexion...");
            Socket socket = serverSocket.accept();
            System.out.println("Servidor> Recibida conexion de " + socket.getInetAddress().getHostAddress() + ":"
                    + socket.getPort());
            return new TCPIP(serverSocket, socket);
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }


    public TCPIP(Socket socket) {
        super(socket);
    }

    public TCPIP(ServerSocket serverSocket, Socket socket) {
        super(serverSocket, socket);
    }

    public void send(List<Color> colors) {
        if (colors == null) { // TODO: Código mejorable
            this.send("null");
        }else {
            this.send(colors);
        }
    }

    public void send(int value) {
        this.send("" + value);
    }

    public void send(Error value) {
        if (value == null) { // TODO: Código mejorable
            this.send("null");
        }else {
            this.send(value.name());
        }
    }

    public Error receiveError() {
        String error = this.receiveLine();
        if (error.equals("null")) {
            return null;
        }
        return Error.valueOf(error);
    }

    public List<Color> receiveColorList() {
        String colors = this.receiveLine();
        if (colors.equals(null)) {
            return null;
        }

        List<Color> result = new ArrayList<Color>();

        for (int i = 0; i < colors.length(); i++) {
            result.add(Color.valueOf(String.valueOf(colors.charAt(i))));
        }

        return result;
    }



    public void close() {
        this.send(FrameType.CLOSE.name());
        super.close();
    }

}
