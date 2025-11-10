public class TestVuln {
    public static void main(String[] args) throws Exception {
        // 🚨 Security Risk Example — for testing only
        Runtime.getRuntime().exec("ls"); // Sonar will flag this as a security hotspot
    }
}
