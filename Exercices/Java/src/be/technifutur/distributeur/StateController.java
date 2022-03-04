package be.technifutur.distributeur;

public interface StateController {
    void start();
    void newInput(String input);
    void stop();
}
