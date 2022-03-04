package be.technifutur.distributeur;

public class DistributeurCtrl implements StateController {
    private StateController state = null;
    private Distributeur model;

    public DistributeurCtrl(Distributeur model) {
        this.model = model;
    }

    @Override
    public void start() {
        state = new InactifCtrl();
        state.start();
        System.out.println("Distributeurctrl.start");
    }

    @Override
    public void newInput(String input) {
        System.out.println(input);
        if ("q".equals(input)){
            state.stop();
            state = null;
        }
    }

    @Override
    public void stop() {
        System.out.println("Distributeurctrl.stop");
        if(state != null){
            state.stop();
            state = null;
        }
    }

    public boolean isFinish(){
        return state==null;
    }
}
