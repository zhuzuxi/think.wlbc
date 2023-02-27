package think.zzs.UDP通信方式.组播;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class receiveThread1 {
    public static void main(String[] args) throws IOException {
        int port = 10000;
        InetAddress group = InetAddress.getByName("224.0.0.10");
        MulticastSocket ds=new MulticastSocket(port);

        ds.joinGroup(group);

        byte[] receiveData=new byte[1024];
        DatagramPacket dp=new DatagramPacket(receiveData, receiveData.length,group,port);

        while (true){
            if (port!=10000){
                break;
            }
            ds.receive(dp);
            byte[] data=dp.getData();
            int len=dp.getLength();
            System.out.println(new String(data, 0, len));

        }
        ds.close();






    }
}
