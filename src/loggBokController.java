import javax.swing.*;
import java.io.IOException;

public class loggBokController {
    private loggBokView view;
    private loggBokModel model;

    public loggBokController() {
        view = new loggBokView();
        model = new loggBokModel();

        JFrame frame = new JFrame("Encryption program (SHHHH DONT TELL)");
        frame.setContentPane(view.getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        /*
        view.getSaveButton().addActionListener(actionEvent -> model.Save(view.getTextArea1(), view.getFilename()) );
        view.getSaveAsButton().addActionListener(actionEvent -> model.SaveAs(view.getTextArea1(), view.chooseNewFilename()));
        view.getLoadFileButton().addActionListener(actionEvent -> view.setResult(model.Load(view.chooseNewFilename())));

        view.getEncryptFileButton().addActionListener(actionEvent -> {
            try {
                model.EncryptFile(view.chooseFilename(),view.getKey());
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        view.getEncryptFileWithFileButton().addActionListener(actionEvent -> {
            try {
                model.EncryptFile(view.chooseFilename(),model.getFile(view.chooseFilename()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        view.getEncryptButton().addActionListener(actionEvent -> view.setResult(model.Encrypt(view.getTextArea1(), view.getKey())));
        view.getEncryptWithFileButton().addActionListener(actionEvent -> view.setResult(model.Encrypt(view.getTextArea1(), model.getFile(view.chooseFilename()))));
         */
    }

    public static void main(String[] args) {
        loggBokController controller = new loggBokController();
    }
}
