import javax.swing.*;
import java.util.ArrayList;

public class loggBokView {
    private JPanel Panel;
    private JTextArea textArea1;
    private JButton newButton;
    private JButton updateButton;
    private JButton saveButton;
    private JList list1;
    private JButton viewButton;

    public loggBokView() {
    }

    public JPanel getPanel() {
        return Panel;
    }
    public JButton getUpdateButton() {
        return updateButton;
    }
    public JButton getSaveButton() {
        return saveButton;
    }
    public JButton getViewButton() {
        return viewButton;
    }
    public JButton getNewButton() {
        return newButton;
    }



    public JTextArea getTextArea1() {
        return textArea1;
    }

    public void setText(String text) {
        this.textArea1.setText(text);
    }

    public void loadloggs(ArrayList<Logg> Loggs){
        DefaultListModel<String> l1 = new DefaultListModel<>();
        for (Logg logg : Loggs) {
            l1.addElement(logg.getPerson()+" "+logg.getCreatedAt()+" "+logg.getUpdatedAt());
        }
        list1.setModel(l1);
    }


    public JList getList() {
        return list1;
    }

    public int getListIndex() {
        return list1.getSelectedIndex();
    }
}
