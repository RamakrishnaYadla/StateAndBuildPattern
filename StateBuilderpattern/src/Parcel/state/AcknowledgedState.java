package Parcel.state;

public class AcknowledgedState implements State{

    ParcelService parcelservice;
    public AcknowledgedState(ParcelService parcelservice) {
        this.parcelservice = parcelservice;
    }
    
    @Override
    public void createParcelService() {
        System.out.println("Parcels are gathered together");
        parcelservice.setState(parcelservice.getCreateState());
    }

    @Override
    public void acknowledgedParcelService() {
        System.out.println("Parcels haven't received acknowledgement");
    }

    @Override
    public void shippedParcelService() {
        System.out.println("Parcel is now available for shipment");
        parcelservice.setState(parcelservice.getShippedState());
    }

    @Override
    public void transistionParcelService() {
        System.out.println("Parcels Transistion not initiated");
        parcelservice.setState(parcelservice.getTransistionState());
    }

    @Override
    public void poBoxParcelService() {
        System.out.println("Parcels are now not taken into P.O Box");
        parcelservice.setState(parcelservice.getPoBoxState());
    }
    
    @Override
    public void outforDeliveryParcelService() {
        System.out.println("Parcel is not reached here for out for Delivery");
        parcelservice.setState(parcelservice.getOutforDeliveryState());

    }

    @Override
    public void deliveredParcelService() {
        System.out.println("Parcel is not available to Deliver");
        parcelservice.setState(parcelservice.getDeliveredState());
    }
}