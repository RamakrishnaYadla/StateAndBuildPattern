package Parcel.state;

public interface State
{
    public abstract void createParcelService();
    public abstract void acknowledgedParcelService();
    public abstract void shippedParcelService();
    public abstract void transistionParcelService();
    public abstract void poBoxParcelService();
    public abstract void outforDeliveryParcelService();
    public abstract void deliveredParcelService();
}
