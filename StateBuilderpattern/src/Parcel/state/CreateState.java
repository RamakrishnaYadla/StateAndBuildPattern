package Parcel.state;

public class CreateState implements State {

    ParcelService parcelservice;
    public CreateState(ParcelService parcelservice) {
        this.parcelservice = parcelservice;
    }

    @Override
    public void createParcelService() {
        System.out.println("Creating a Parcel Service Request");
    }

    @Override
    public void acknowledgedParcelService() {
        System.out.println("Parcel is received");
        parcelservice.setState(parcelservice.getAcknowledgedState());
    }

    @Override
    public void shippedParcelService() {
        System.out.println("Parcel is now shipped");
        parcelservice.setState(parcelservice.getShippedState());
    }

    @Override
    public void transistionParcelService() {
        System.out.println("Parcel is in Transistion");
        parcelservice.setState(parcelservice.getTransistionState());
    }

    @Override
    public void poBoxParcelService() {
        System.out.println("Parcel is available now in P.O Box");
        parcelservice.setState(parcelservice.getPoBoxState());
    }
    
    @Override
    public void outforDeliveryParcelService() {
        System.out.println("Parcel is out for Delivery");
        parcelservice.setState(parcelservice.getOutforDeliveryState());
    }

    @Override
    public void deliveredParcelService() {
        System.out.println("Parcel is Delivered");
        parcelservice.setState(parcelservice.getDeliveredState());
    }
}