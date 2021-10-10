package Parcel.state;

public interface Parcel {
    Parcel Name();
    Parcel IDSNumber();
    Parcel POBoxNumber();
    ParcelService build();
}