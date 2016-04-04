package roman.part10.innerclasses;

public class Parcel6 {

    public void internalTracking(boolean flag){
        if (flag) {
            class TrackingSlip{

                private String id;
                TrackingSlip(String setLabel){
                    this.id = setLabel;
                }

                String getSlip(){
                    return id;
                }
            }

            TrackingSlip trackingSlip = new TrackingSlip("Ожидание");
            String stateOfPiece = trackingSlip.getSlip();
            System.out.println(stateOfPiece);
        }
    }

    public void track(){
        this.internalTracking(true);
    }

    public static void main(String[] args) {
        Parcel6 parcel = new Parcel6();
        parcel.track();
    }
}
