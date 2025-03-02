import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;

public class MiniJava {
    private static InputStream is;
    private static BufferedReader bufferedReader;

    public MiniJava() {
    }

    public static String readString(String text) {
        if (System.in != is) {
            is = System.in;
            bufferedReader = new BufferedReader(new InputStreamReader(is));
        }

        try {
            System.out.println(text);
            return bufferedReader.readLine();
        } catch (IOException var2) {
            throw new RuntimeException("Could not read input.");
        }
    }

    public static String readString() {
        return readString("Input:");
    }

    public static int readInt(String text) {
        String s = readString(text);
        if (s == null) {
            System.exit(0);
        }

        int x;
        try {
            x = Integer.parseInt(s.trim());
        } catch (NumberFormatException var4) {
            x = readInt(text);
        }

        return x;
    }

    public static int readInt() {
        return readInt("Please insert an integer:");
    }

    public static int read(String text) {
        return readInt(text);
    }

    public static int read() {
        return readInt();
    }

    public static double readDouble(String text) {
        String s = readString(text);
        if (s == null) {
            System.exit(0);
        }

        double x;
        try {
            x = Double.parseDouble(s.trim());
        } catch (NumberFormatException var5) {
            x = readDouble(text);
        }

        return x;
    }

    public static double readDouble() {
        return readDouble("Please insert a FP number:");
    }

    public static void write(String output) {
        System.out.println(output);
    }

    public static void write(int output) {
        write("" + output);
    }

    public static void write(double output) {
        write("" + output);
    }

    public static void writeLineConsole(String output) {
        System.out.println(output);
    }

    public static void writeLineConsole(int output) {
        writeLineConsole("" + output);
    }

    public static void writeLineConsole(double output) {
        writeLineConsole("" + output);
    }

    public static void writeLineConsole() {
        writeLineConsole("");
    }

    public static void writeConsole(String output) {
        System.out.print(output);
    }

    public static void writeConsole(int output) {
        writeConsole("" + output);
    }

    public static void writeConsole(double output) {
        writeConsole("" + output);
    }

    public static int randomInt(int minval, int maxval) {
        return minval + (new Random()).nextInt(maxval - minval + 1);
    }

    public static int drawCard() {
        return randomInt(2, 11);
    }

    public static int dice() {
        return randomInt(1, 6);
    }

    static {
        is = System.in;
        bufferedReader = new BufferedReader(new InputStreamReader(is));
    }
}