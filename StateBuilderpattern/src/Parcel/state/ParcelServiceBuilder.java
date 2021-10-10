package Parcel.state;

public class ParcelServiceBuilder implements Parcel{

    ParcelServiceBuilder(){

    }

    @Override
    public Parcel Name() {
        System.out.println("Parcel Service is initiated for the person");
        return this;
    }

    @Override
    public Parcel IDSNumber() {
        System.out.println("Parcel Service is initiated with this IDSNumber");
        return this;
    }

    @Override
    public Parcel POBoxNumber() {
        System.out.println("Parcel Service is for the particular POBox");
        return this;
    }

    @Override
    public ParcelService build() {
        ParcelService ps=new ParcelService();
        System.out.println("=====Parcel Service initiated=====");
        return ps;
    }
}