import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class loggBokModel {
    private ArrayList<Logg> Loggs;

    public ArrayList<Logg> loadloggs() throws IOException, ClassNotFoundException {
        ObjectInputStream ins =new ObjectInputStream(new FileInputStream(new File("testSave")));
        ArrayList<Logg> Loggs = new ArrayList<Logg>();
        Logg l;
        try {
            while ((l = (Logg) ins.readObject())!=null) {
                Loggs.add(l);
            }
        } catch (IOException E) {
            //E.printStackTrace();
        }
        ins.close();

        this.Loggs=Loggs;
        return Loggs;
    }
    public ArrayList<Logg> getloggs() {
        return this.Loggs;
    }

    public String getMessage(int index) {
        return Loggs.get(index).getMessage();
    }

    public void newLogg() {
        String Person = JOptionPane.showInputDialog(null, "Who is writing");
        Loggs.add(new Logg(Person, ""));
    }
    public void update(int listIndex, String text) {
        Loggs.get(listIndex).update(text);
    }

    public void Save(ArrayList<Logg> getloggs) throws IOException {
        ObjectOutputStream outs=new ObjectOutputStream(new FileOutputStream(new File("testSave")));
        for (int i = 0; i<Loggs.size(); i++) {
            outs.writeObject(Loggs.get(i));
        }
        outs.flush();
        outs.close();
    }
}
