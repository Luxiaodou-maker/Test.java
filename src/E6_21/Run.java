package E6_21;

import java.io.IOException;

public class Run {
    public static void main(String[] args) {
        try {
            Process exec = Runtime.getRuntime().exec("explorer \"C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe\"");
        } catch (IOException e) {
            e.getMessage();
        }
    }

}
