import javax.swing.*;
import java.io.IOException;

public class loggBokController {
    private loggBokView view;
    private loggBokModel model;

    public loggBokController() throws IOException, ClassNotFoundException {
        view = new loggBokView();
        model = new loggBokModel();

        JFrame frame = new JFrame("Logg Bok");
        frame.setContentPane(view.getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        view.loadloggs(model.loadloggs());




        view.getSaveButton().addActionListener(actionEvent -> {
            try {
                model.Save(model.getloggs());
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        view.getUpdateButton().addActionListener(actionEvent -> update());

        view.getNewButton().addActionListener(actionEvent -> NewLogg());
        view.getViewButton().addActionListener(actionEvent -> view.setText(model.getMessage(view.getListIndex())));



    }

    private void update() {
        model.update(view.getListIndex(), view.getTextArea1().getText());
        view.loadloggs(model.getloggs());
    }

    private void NewLogg() {
        model.newLogg();
        view.loadloggs(model.getloggs());
        view.setText(model.getMessage(model.getloggs().size()-1));
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        loggBokController controller = new loggBokController();
    }
}

