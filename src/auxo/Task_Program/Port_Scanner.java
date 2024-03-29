package auxo.Task_Program;

import javax.swing.*;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Port_Scanner {

    public static void main(String[] args) {
        InetAddress ia=null;
        String host=null;
        try {

            host=JOptionPane.showInputDialog("Enter the Host name to scan:\n example: xyz.com");
            if(host!=null){
                ia = InetAddress.getByName(host);
                scan(ia); }
        }
        catch (UnknownHostException e) {
            System.err.println(e );
        }
        System.out.println("Bye from NFS");
        //System.exit(0);
    }

    public static void scan(final InetAddress remote) {
        //variables for menu bar

        int port=0;
        String hostname = remote.getHostName();

        for ( port = 8080; port < 65536; port++) {
            try {
                Socket s = new Socket(remote,port);
                System.out.println("Server is listening on port " + port+ " of " + hostname);
                s.close();
            }
            catch (IOException ex) {
                // The remote host is not listening on this port
                System.out.println("Server is not listening on port " + port+ " of " + hostname);
            }
        }//for ends
    }
}




