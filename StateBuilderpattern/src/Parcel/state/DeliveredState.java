package Parcel.state;

public class DeliveredState implements State {

    ParcelService parcelservice;
    public DeliveredState(ParcelService parcelservice) {
        this.parcelservice = parcelservice;
    }

    @Override
    public void createParcelService() {
        System.out.println("Parcels are gathered together");
        parcelservice.setState(parcelservice.getCreateState());
    }

    @Override
    public void acknowledgedParcelService() {
        System.out.println("Parcels acknowledged");
        parcelservice.setState(parcelservice.getAcknowledgedState());
    }

    @Override
    public void shippedParcelService() {
        System.out.println("Parcel shipment initiated");
        parcelservice.setState(parcelservice.getShippedState());
    }

    @Override
    public void transistionParcelService() {
        System.out.println("Parcels Transistion initiated");
        parcelservice.setState(parcelservice.getTransistionState());
    }

    @Override
    public void poBoxParcelService() {
        System.out.println("Parcels available in P.O Box");
        parcelservice.setState(parcelservice.getPoBoxState());
    }
    
    @Override
    public void outforDeliveryParcelService() {
        System.out.println("Parcel is out for Delivery");
        parcelservice.setState(parcelservice.getOutforDeliveryState());
    }

    @Override
    public void deliveredParcelService() {
        System.out.println("Parcel is not Delivered");
    }
}