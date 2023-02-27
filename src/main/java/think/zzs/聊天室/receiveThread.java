package think.zzs.聊天室;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class receiveThread {
    public static void main(String[] args) throws IOException {
        int port = 10086;
        DatagramSocket ds=new DatagramSocket(port);
        byte[] receiveData=new byte[1024];
        DatagramPacket dp=new DatagramPacket(receiveData, receiveData.length);
        while (true){
            if (port!=10086){
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
