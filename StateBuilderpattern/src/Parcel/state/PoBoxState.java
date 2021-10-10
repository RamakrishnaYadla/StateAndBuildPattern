package Parcel.state;

public class PoBoxState implements State {

    ParcelService parcelservice;
    public PoBoxState(ParcelService parcelservice) {
        this.parcelservice = parcelservice;
    }

    @Override
    public void createParcelService() {
        System.out.println("Parcel Service Request processed");
        parcelservice.setState(parcelservice.getCreateState());
    }

    @Override
    public void acknowledgedParcelService() {
        System.out.println("Parcel received");
        parcelservice.setState(parcelservice.getAcknowledgedState());
    }

    @Override
    public void shippedParcelService() {
        System.out.println("Parcel is now shipped");
        parcelservice.setState(parcelservice.getShippedState());
    }

    @Override
    public void transistionParcelService() {
        System.out.println("Parcel moved for Transistion");
        parcelservice.setState(parcelservice.getTransistionState());

    }

    @Override
    public void poBoxParcelService() {
        System.out.println("Parcel is not received at P.O Box");
    }
    
    @Override
    public void outforDeliveryParcelService() {
        System.out.println("Parcel is not available to out for Delivery");
        parcelservice.setState(parcelservice.getOutforDeliveryState());
    }

    @Override
    public void deliveredParcelService() {
        System.out.println("Parcel is not going to Deliver");
        parcelservice.setState(parcelservice.getDeliveredState());
    }
}