package think.zzs.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class udpreceive {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);

        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,0,bytes.length);

        ds.receive(dp);//ds接收到数据并打包到dp中

        byte[] data=dp.getData();
        InetAddress address=dp.getAddress();
        int port=dp.getPort();
        int length=dp.getLength();

        System.out.println("接收到数据："+new String(data,0,length));
        System.out.println("从"+address+"发送，端口号："+port);

        ds.close();


    }
}
