public class ProcessRuntimes {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        String command = "NOTEPAD";
        Process p;

        try {
            p = r.exec( command );
        } catch (Exception e) {
            System.out.println("Error in " + command);
            e.printStackTrace();
        }
    }
}