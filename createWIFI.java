
    import java.io.IOException;

public class createWIFI {

    public static void main(String[] args) {
        // Replace "YourSSID" and "YourPassword" with the desired SSID and password
        String ssid = "YourSSID";
        String password = "YourPassword";

        try {
            // Command for creating an ad-hoc WiFi network on Windows using netsh
            String command = "netsh wlan set hostednetwork mode=allow ssid=" + ssid + " key=" + password;

            // Run the command
            ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", command);
            Process process = processBuilder.start();

            // Wait for the process to complete
            int exitCode = process.waitFor();

            if (exitCode == 0) {
                System.out.println("WiFi network created successfully.");
            } else {
                System.err.println("Failed to create WiFi network. Exit code: " + exitCode);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
    

