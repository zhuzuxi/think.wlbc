package think.zzs.other;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetaddressTest {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress address;

        address = InetAddress.getByName("192.168.199.120");
        System.out.println(address.getHostName());
        System.out.println(address.getHostAddress());

        }

}

