package nestedclasses.dns;

import java.util.ArrayList;
import java.util.List;

public class NameServer {

    private static class DnsEntry {

        private String name;
        private String ip;

        public DnsEntry(String name, String ip) {
            this.name = name;
            this.ip = ip;
        }
    }

    private List<DnsEntry> dnsEntries = new ArrayList<>();


    public List<DnsEntry> getDnsEntries() {
        return dnsEntries;
    }

    public void addEntry(String hostName, String hostIp){
        for (DnsEntry d: dnsEntries){
            if (d.ip.equals(hostIp) || d.name.equals(hostName)){
                throw new IllegalArgumentException("Already exists");
            }
        }
        dnsEntries.add(new DnsEntry(hostName,hostIp));
    }

    public void removeEntryByName(String name){
        DnsEntry remove = null;
        for (DnsEntry d: dnsEntries){
            if (d.name.equals(name)){
                remove = d;
            }
        }
        dnsEntries.remove(remove);
    }

    public void removeEntryByIp (String ip){
        DnsEntry remove = null;
        for (DnsEntry d: dnsEntries){
            if (d.ip.equals(ip)){
                remove = d;
            }
        }
        dnsEntries.remove(remove);
    }

    public String getIpByName(String name){
        for (DnsEntry d: dnsEntries){
            if (d.name.equals(name)){
                return d.ip;
            }
        }
        throw new IllegalArgumentException("Element not found");
    }

    public String getNameByIp (String ip){
        for (DnsEntry d: dnsEntries){
            if (d.ip.equals(ip)){
                return d.name;
            }
        }
        throw new IllegalArgumentException("Element not found");
    }
}
