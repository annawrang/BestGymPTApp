package bestgymptapplication;

public class BestGymPTApplication{

    DatabaseConnection dc;
    GuiFrame gf;
    LoggedOnFrame lf;
    int stage;

    public BestGymPTApplication() {
        dc = new DatabaseConnection();
        gf = new GuiFrame(dc);

    }


    public static void main(String[] args) {
        BestGymPTApplication ptApp = new BestGymPTApplication();


    }

}