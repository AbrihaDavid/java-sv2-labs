package interfacerules.bill;

import java.nio.file.Paths;
import java.util.List;

public class SimpleBillWriter implements BillWriter{

    @Override
    public String writeBill(List<String> billItems) {
        StringBuilder sb = new StringBuilder();
        for (String item: billItems){
            String[] strings = item.split(";");
            sb.append(strings[0]).append(", ").append(strings[2]).append(" * ").append(strings[1]).append(" = ").append(Integer.parseInt(strings[2])*Integer.parseInt(strings[1])).append(" Ft").append("\n");
        }
        return sb.toString();
    }
}
