import java.io.*;

public class Serialize {
    public Serialize() {}
    public static void main(String[] args) {
        try {
            SerObject sobjout = new SerObject(5, "a", true);
            FileOutputStream fout = new FileOutputStream("./object.txt", false);
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(sobjout);

            FileInputStream fin = new FileInputStream("./object.txt");
            ObjectInputStream oin = new ObjectInputStream(fin);
            SerObject sobjin = (SerObject) oin.readObject();

            if(sobjin.isBool()) {
                System.out.println(sobjin.toString());
            }
            else {
                System.out.println("It's a secret!");
            }
        }
        catch (Exception e) {}
    }
}
