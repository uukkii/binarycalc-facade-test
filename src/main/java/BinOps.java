public class BinOps {
    public String sum(String a, String b) {
        int aBin = Integer.parseInt(a, 2);
        int bBin = Integer.parseInt(b, 2);
        return Integer.toBinaryString(aBin + bBin);
    }

    public String mult(String a, String b) {
        int aBin = Integer.parseInt(a, 2);
        int bBin = Integer.parseInt(b, 2);
        return Integer.toBinaryString(aBin * bBin);
    }
}