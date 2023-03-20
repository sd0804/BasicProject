package org.example.designpatterns;
import java.util.ArrayList;
import java.util.List;

class Vehicle2 implements Cloneable {
    private List<String> vehicleList;

    public Vehicle2() {
        this.vehicleList = new ArrayList<String>();
    }

    public Vehicle2(List<String> list) {
        this.vehicleList = list;
    }

    public void insertData() {
        vehicleList.add("Honda amaze");
        vehicleList.add("Audi A4");
        vehicleList.add("Hyundai Creta");
        vehicleList.add("Maruti Baleno");
        vehicleList.add("Renault Duster");
    }

    public List<String> getVehicleList() {
        return this.vehicleList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> tempList = new ArrayList<String>();

        for(String s : this.getVehicleList()) {
            tempList.add(s);
        }

        return new Vehicle2(tempList);
    }
}

class PrototypePatternExample {

    public static void main(String[] args) throws CloneNotSupportedException {
        Vehicle2 a = new Vehicle2();
        a.insertData();

        Vehicle2 b = (Vehicle2) a.clone();
        List<String> list = b.getVehicleList();
        list.add("Honda new Amaze");

        System.out.println(a.getVehicleList());
        System.out.println(list);

        b.getVehicleList().remove("Audi A4");
        System.out.println(list);
        System.out.println(a.getVehicleList());
    }

}