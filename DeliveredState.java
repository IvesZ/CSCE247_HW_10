public class DeliveredState implements State {
    private Package pkg;

    public DeliveredState(Package pkg){
        this.pkg = pkg;
    }

    /**
     * display info
     */
    @Override
    public void displayStatus(){
        System.out.println(this.pkg.getName() + " is here for you");
    }

    /**
     * display info
     */
    @Override
    public void displayETA() {
        System.out.println(this.pkg.getName() + " is here");
    }
}
