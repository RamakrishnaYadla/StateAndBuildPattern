package Parcel.state;

public class OutforDeliveryState implements State {

    ParcelService parcelservice;
    public OutforDeliveryState(ParcelService parcelservice) {
        this.parcelservice = parcelservice;
    }

    @Override
    public void createParcelService() {
        System.out.println("Parcel Service Request initiated");
        parcelservice.setState(parcelservice.getCreateState());
    }

    @Override
    public void acknowledgedParcelService() {
        System.out.println("Parcel is collected");
        parcelservice.setState(parcelservice.getAcknowledgedState());

    }

    @Override
    public void shippedParcelService() {
        System.out.println("Parcel available at shippment");
        parcelservice.setState(parcelservice.getShippedState());
    }

    @Override
    public void transistionParcelService() {
        System.out.println("Parcel is on the way for transistion");
        parcelservice.setState(parcelservice.getTransistionState());
    }

    @Override
    public void poBoxParcelService() {
        System.out.println("Parcel moved to P.O Box");
        parcelservice.setState(parcelservice.getPoBoxState());
    }
    
    @Override
    public void outforDeliveryParcelService() {
        System.out.println("Parcel not moved to out for Delivery");
    }

    @Override
    public void deliveredParcelService() {
        System.out.println("Parcel is having issue to Deliver");
        parcelservice.setState(parcelservice.getDeliveredState());
    }
}