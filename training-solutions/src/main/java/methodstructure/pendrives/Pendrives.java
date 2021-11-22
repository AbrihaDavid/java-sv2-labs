package methodstructure.pendrives;

import java.util.List;

public class Pendrives {

    public Pendrive getBest(List<Pendrive> pendriveList){
        Pendrive pendriveWithBestPricePerCapacity = null;

        for (Pendrive pendrive: pendriveList){
            if (pendriveWithBestPricePerCapacity == null || (pendrive.getPrice()/pendrive.getCapacity()) < (pendriveWithBestPricePerCapacity.getPrice() / pendriveWithBestPricePerCapacity.getCapacity())){
                pendriveWithBestPricePerCapacity = pendrive;
            }
        }
        return pendriveWithBestPricePerCapacity;
    }

    public Pendrive getCheapest(List<Pendrive> pendriveList){
        Pendrive cheapestPendrive = null;

        for (Pendrive pendrive: pendriveList){
            if (cheapestPendrive == null || pendrive.getPrice() < cheapestPendrive.getPrice()){
                cheapestPendrive = pendrive;
            }
        }
        return cheapestPendrive;
    }

    public void risePriceWhereCapacity(List<Pendrive> pendriveList, int percent, int capacity){

        for (Pendrive pendrive: pendriveList){
            if (pendrive.getCapacity() == capacity){
                pendrive.risePrice(percent);
            }
        }
    }
}
