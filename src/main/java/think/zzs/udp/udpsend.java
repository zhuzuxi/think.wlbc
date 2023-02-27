package think.zzs.udp;

import java.io.IOException;
import java.net.*;

public class udpsend {
    public static void main(String[] args) throws IOException {
//        创建数据管理平台
        DatagramSocket ds=new DatagramSocket();

//        发送数据并打包
        String msg="udp 6666";
//              数据传输是以字节数组传输的
        byte[] bytes = msg.getBytes();

        InetAddress address=InetAddress.getByName("127.0.0.1");  // 目标地址
        int prot=10086;//目标端口
        DatagramPacket packet=new DatagramPacket(bytes, bytes.length, address, prot);

        ds.send(packet);
        ds.close();


    }
}
