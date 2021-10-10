package Parcel.state;

public class Main {

    public static void main(String[] args) {

        ParcelServiceBuilder psb=new ParcelServiceBuilder();
        ParcelService ps=psb.Name().IDSNumber().POBoxNumber().build();

        ps.createParcelService();

        ps.acknowledgedParcelService();

        ps.shippedParcelService();

        ps.transistionParcelService();

        ps.poBoxParcelService();
        
        ps.outforDeliveryParcelService();
        
        ps.deliveredParcelService();
    }
}