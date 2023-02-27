package think.zzs.UDP通信方式.组播;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;

public class sendThread {
    public static void main(String[] args) throws IOException {
//       组播地址范围 224.0.0.0 ~ 239.255.255.255
        int prot=10000;
        MulticastSocket ds=new MulticastSocket(prot);
        InetAddress receiver=InetAddress.getByName("224.0.0.10");

        ds.joinGroup(receiver);
        Scanner scanner=new Scanner(System.in);
        byte[] buffer;
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
