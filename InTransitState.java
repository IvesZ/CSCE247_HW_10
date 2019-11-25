public class InTransitState implements State {
    private Package pkg;

    public InTransitState(Package pkg){
        this.pkg = pkg;
    }

    /**
     * display info
     */
    @Override
    public void displayStatus(){
        System.out.println(this.pkg.getName() + " is out for delivery");
    }

    /**
     * display info
     */
    @Override
    public void displayETA() {
        System.out.println(this.pkg.getName() + " should arrive within 5 days");
    }
}
