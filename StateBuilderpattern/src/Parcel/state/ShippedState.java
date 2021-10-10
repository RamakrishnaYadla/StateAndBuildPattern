package Parcel.state;

public class ShippedState implements State {

    ParcelService parcelservice;
    public ShippedState(ParcelService parcelservice) {
        this.parcelservice = parcelservice;
    }

    @Override
    public void createParcelService() {
        System.out.println("Created Parcel Service Request");
        parcelservice.setState(parcelservice.getCreateState());
    }

    @Override
    public void acknowledgedParcelService() {
        System.out.println("Parcel is collected");
        parcelservice.setState(parcelservice.getAcknowledgedState());

    }

    @Override
    public void shippedParcelService() {
        System.out.println("Parcel not received for shipment");
    }

    @Override
    public void transistionParcelService() {
        System.out.println("Parcel is not moving to Transistion");
        parcelservice.setState(parcelservice.getTransistionState());

    }

    @Override
    public void poBoxParcelService() {
        System.out.println("Parcel wont be in P.O Box");
        parcelservice.setState(parcelservice.getPoBoxState());
    }
    
    @Override
    public void outforDeliveryParcelService() {
        System.out.println("Parcel is not ready to out for Delivery");
        parcelservice.setState(parcelservice.getOutforDeliveryState());

    }

    @Override
    public void deliveredParcelService() {
        System.out.println("Parcel had issue to Delivery");
        parcelservice.setState(parcelservice.getDeliveredState());
    }
}