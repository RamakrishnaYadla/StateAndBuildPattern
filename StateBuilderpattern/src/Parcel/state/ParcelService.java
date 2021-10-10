package Parcel.state;

public class ParcelService
{
    AcknowledgedState acknowledgedState;
    ShippedState shippedState;
    TransistionState transistionState;
    PoBoxState poBoxState;
    OutforDeliveryState outforDeliveryState;
    DeliveredState deliveredState;
    CreateState createState;
    State state;

    ParcelService()
    {
    	acknowledgedState = new AcknowledgedState(this);
    	shippedState= new ShippedState(this);
    	transistionState = new TransistionState(this);
    	poBoxState = new PoBoxState(this);
    	outforDeliveryState = new OutforDeliveryState(this);
    	deliveredState = new DeliveredState(this);
        createState=new CreateState(this);
        state=createState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public AcknowledgedState getAcknowledgedState() {
        return acknowledgedState;
    }

    public ShippedState getShippedState() {
        return shippedState;
    }

    public TransistionState getTransistionState() {
        return transistionState;
    }
    
    public PoBoxState getPoBoxState() {
        return poBoxState;
    }
    
    public OutforDeliveryState getOutforDeliveryState() {
        return outforDeliveryState;
    }
    
    public DeliveredState getDeliveredState() {
        return deliveredState;
    }
    
    public CreateState getCreateState() {
        return createState;
    }

    public void createParcelService()  {
        state.createParcelService();
    }

    public void acknowledgedParcelService()  {
        state.acknowledgedParcelService();
    }

    public void shippedParcelService() {
        state.shippedParcelService();
    }
    
    public void transistionParcelService() {
        state.transistionParcelService();
    }

    public void poBoxParcelService()  {
        state.poBoxParcelService();
    }

    public void outforDeliveryParcelService() {
        state.outforDeliveryParcelService();
    }
    
    public void deliveredParcelService() {
        state.deliveredParcelService();
    }
    
    public String toString() {
        StringBuffer sbuffer=new StringBuffer();
        sbuffer.append("\nParcelService State  \nParcelService "+state);
        return sbuffer.toString();
    }
}