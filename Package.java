public class Package {

    // variables
    private State orderedState;
    private State inTransitState;
    private State deliveredState;
    private String name;
    private State state;

    /**
     * set the name and state variables
     * @param contents name of Package
     */
    public Package(String contents){
        this.orderedState = new OrderedState(this);
        this.inTransitState = new InTransitState(this);
        this.deliveredState = new DeliveredState(this);
        this.name = contents;
    }

    /**
     * set the state, display the status and eta
     */
    public void order(){
        setState(orderedState);
        state.displayStatus();
        state.displayETA();
    }

    /**
     * set the state, display the status and eta
     */
    public void mail(){
        setState(inTransitState);
        state.displayStatus();
        state.displayETA();
    }

    /**
     * set the state, display the status
     */
    public void received(){
        setState(deliveredState);
        state.displayStatus();
    }

    // setter ang getter
    public void setState(State state){
        this.state = state;
    }

    public String getName(){
        return this.name;
    }
}

