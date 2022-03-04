package be.technifutur.distributeur;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        DistributeurCtrl ctrl = getDistributeurCtrl();
        Scanner scan = new Scanner(System.in);
        ctrl.start();
        while(!ctrl.isFinish()){
            ctrl.newInput(scan.nextLine());
        }
        ctrl.stop();
    }

    private static DistributeurCtrl getDistributeurCtrl(){
        Distributeur model = new Distributeur();

        DistributeurCtrl distributeurCtrl = new DistributeurCtrl(model);
        return distributeurCtrl;
    }
}
