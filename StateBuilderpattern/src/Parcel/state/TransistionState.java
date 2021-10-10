package Parcel.state;

public class TransistionState implements State {

    ParcelService parcelservice;
    public TransistionState(ParcelService parcelservice) {
        this.parcelservice = parcelservice;
    }

    @Override
    public void createParcelService() {
        System.out.println("Parcel collected to delivery");
        parcelservice.setState(parcelservice.getCreateState());
    }

    @Override
    public void acknowledgedParcelService() {
        System.out.println("Parcel acknowledgement processed");
        parcelservice.setState(parcelservice.getAcknowledgedState());
    }

    @Override
    public void shippedParcelService() {
        System.out.println("Parcel is ready for shipment");
        parcelservice.setState(parcelservice.getShippedState());
    }

    @Override
    public void transistionParcelService() {
        System.out.println("Parcel Transistion haven't initiate so far");
    }

    @Override
    public void poBoxParcelService() {
        System.out.println("Parcel are haven't reached to P.O Box");
        parcelservice.setState(parcelservice.getPoBoxState());
    }
    
    @Override
    public void outforDeliveryParcelService() {
        System.out.println("Parcel is not available for out for Delivery");
        parcelservice.setState(parcelservice.getOutforDeliveryState());

    }

    @Override
    public void deliveredParcelService() {
        System.out.println("Delay in the Parcel Delivery");
        parcelservice.setState(parcelservice.getDeliveredState());
    }
}