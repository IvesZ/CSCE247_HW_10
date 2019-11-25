public class OrderedState implements State{
    private Package pkg;

    public OrderedState(Package pkg){
        this.pkg = pkg;
    }

    /**
     * display info
     */
    @Override
    public void displayStatus(){
        System.out.println(pkg.getName() + " was ordered");
    }

    /**
     * display info
     */
    @Override
    public void displayETA() {
        System.out.println(pkg.getName() + " should arrive in 5 to 7 business days");
    }
}
