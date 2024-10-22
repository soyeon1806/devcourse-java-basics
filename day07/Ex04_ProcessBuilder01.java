package day07;

public class Ex04_ProcessBuilder01 {
    public static void main(String[] args) throws Exception {
        ProcessBuilder pb = new ProcessBuilder("C:\\Windows\\system32\\notepad.exe");
                       // = new ProcessBuilder("c:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
        pb.start();
    }
}
