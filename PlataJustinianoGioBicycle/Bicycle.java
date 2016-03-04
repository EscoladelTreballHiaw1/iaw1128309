public class Bicycle {
    /** The bicycle's model */
    private String model;
    /** The engaged front sprocket. */
    private int frontSprocket;
    /** The engaged rear sprocket.*/
    private int rearSprocket;
    /** The number of front sprockets the bicycle has. */
    private final int nFrontSprockets;
    /** The number of rear sprockets the bicycle has. */
    private final int nRearSprockets;
    /** The bicycle's speed in km/h. */
    private double v;
    /** The maximum speed of the bicycle. */
    private final static int VMAX = 100;
    /** The increment of the bicycle's speed. */
    private final static int DV = 5;
    
    /** Constructors */
    public Bicycle() {
        this.model = "mountain bike";
        setFrontSprocket(3);
        setRearSprocket(1);
        this.nFrontSprockets = 3;
        this.nRearSprockets = 7;
        this.v = 0;
    }
    
    public Bicycle(int nFrontSprockets, int nRearSprockets, double v) {
        this.model = "Mountain bike";
        this.nFrontSprockets = nFrontSprockets;
        if (nRearSprockets >= 3) {
            this.nRearSprockets = nRearSprockets;
        } else {
            this.nRearSprockets = 3;
        }
        setFrontSprocket(nFrontSprockets);
        setRearSprocket(1);
        this.v = v;
    }
    
    public Bicycle(String model, int frontSprocket, int rearSprocket, int nFrontSprockets, int nRearSprockets, double v) {
        this.model = model;
        setFrontSprocket(frontSprocket);
        setRearSprocket(rearSprocket);
        this.nFrontSprockets = nFrontSprockets;
        if (nRearSprockets >= 3) {
            this.nRearSprockets = nRearSprockets;
        } else {
            this.nRearSprockets = 3;
        }
        this.v = v;
    }
    
    // Setter and getters
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model.trim();
    }
    
    public int getRearSprocket() {
        return rearSprocket;
    }
    
    public void setRearSprocket(int rearSprocket) {
        if (changeRearSprocket(rearSprocket)) {
            this.rearSprocket = rearSprocket;
        }
    }
    
    public int getFrontSprocket() {
        return frontSprocket;
    }
    
    public void setFrontSprocket(int frontSrpocket) {
        if (changeFrontSprocket(frontSprocket)) {
            this.frontSprocket = frontSprocket;
        }
    }
    
    public double getV() {
        return v;
    }
    
    public void setV(double v) {
        this.v = v;
    }
    
    public int getNFrontSprockets() {
        return nFrontSprockets;
    }
    
    /*public void setNFrontSprockets(int nFrontSprockets) {
        this.nFrontSprockets = nFrontSprockets;
    }*/
     
    public int getNRearSprockets() {
        return nRearSprockets;
    }
    
    /*public void setNRearSprockets(int nRearSprockets) {
        this.nRearSprockets = nRearSprockets;
    }*/
    
    /** Accelerate velocity */
    public void accelerate() {
        this.v += DV;
        if (this.v > VMAX) {
            this.v = VMAX;
        }
    }
    
    /** Start braking */
    public void brake() {
        this.v -= DV;
        if (this.v < 0) {
            this.v = 0;
        }
    }
    
    /** Stop **/
    public void stop() {
        this.v = 0;
    }
    /** Change Sprockets */
    public boolean changeFrontSprocket(int n) {
        boolean shiftPossible = true;
        if (n > 0 && this.frontSprocket < this.nFrontSprockets && this.v > 0) {
            this.frontSprocket++;
            shiftPossible = true;
        } else if (n < 0 && this.frontSprocket > 1 && this.frontSprocket <= this.nFrontSprockets && this.v > 0) {
            this.frontSprocket--;
            shiftPossible = true;
        } else {
            shiftPossible = false;
        }
        return shiftPossible;
    }
    
    public boolean changeRearSprocket(int n) {
        boolean shiftPossible = true;
        if (n > 0 && this.rearSprocket < this.nRearSprockets && this.v > 0) {
            this.rearSprocket++;
            shiftPossible = true;
        } else if (n < 0 && this.rearSprocket > 1 && this.rearSprocket <= this.nRearSprockets && this.v > 0) {
            this.rearSprocket--;
            shiftPossible = true;
        } else {
            shiftPossible = false;
        }
        return shiftPossible;
    }
}