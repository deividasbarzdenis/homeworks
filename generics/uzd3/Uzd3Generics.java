package generics.uzd3;

import static generics.uzd3.DnsProvider.CLOUDFLARE;
import static generics.uzd3.DnsProvider.GOOGLE;

public class Uzd3Generics {
    public static void main(String[] args) {
        Map<DnsProvider, DnsServer> dnsMap = new Map<>();

        dnsMap.addToMap(GOOGLE,new DnsServer("8.8.8.8","8.8.4.4"));
        dnsMap.addToMap(CLOUDFLARE,new DnsServer("1.1.1.1","1.0.0.1"));

        DnsServer googleDns = dnsMap.getValue(GOOGLE);
        System.out.println(googleDns);

        Map<String, String> wordMap = new Map<>();
        wordMap.addToMap("Labas", "Hello");
        wordMap.addToMap("Pasaulis", "World");

        String hello = wordMap.getValue("Labas");
        System.out.println(hello);
    }
}
