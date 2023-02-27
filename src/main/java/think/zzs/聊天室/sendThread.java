package think.zzs.聊天室;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class sendThread {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket();
        int prot=10086;
        InetAddress receiver=InetAddress.getByName("127.0.0.1");
        Scanner scanner=new Scanner(System.in);
        byte[] buffer=new byte[1024];
        String msg="";

        while (true) {
            msg=scanner.nextLine();
            if(!msg.equals("bye")){
                buffer=msg.getBytes();
                DatagramPacket dp=new DatagramPacket(buffer,buffer.length,receiver,prot);
                ds.send(dp);
            }else{
                break;
            }
        }
        ds.close();

    }

}
