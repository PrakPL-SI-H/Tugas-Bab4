
public class PraktikumEnkapsulasi {

    private String[] Nama;
    private String[] Alamat;
    private String[] NomorTelepon;
    private String[] AlamatEmail;
    private String[] Judul;
    private String[][] datadata = {{"Nama", "Alamat", "Nomor Telepon", "Alamat Email"}, {"Lasma Triani Silalahi", "Jl. MT. Haryono (Kav A) No. 1", "085247643000", "lasmatriani@gmail.com"}, {"Naurah Nazifah", "Jl. Wahid Hasyim RT. 01 No.04", "085386347735", "nrhnzfh@gmail.com"}, {"Aulia Rahmasari Anwar", "Jl. Rawa Indah RT. 02 No.10", "082351398788", "auliarahmasari04@gmail.com"}};


    public String[] getNama() {
        return Nama;
    }

    public void setNama(String[] Nama) {
        this.Nama = Nama;
    }

    public String[] getAlamat() {
        return Alamat;
    }

    public void setAlamat(String[] Alamat) {
        this.Alamat = Alamat;
    }

    public String[] getNomorTelepon() {
        return NomorTelepon;
    }

    public void setNomorTelepon(String[] NomorTelepon) {
        this.NomorTelepon = NomorTelepon;
    }

    public String[] getAlamatEmail() {
        return AlamatEmail;
    }

    public void setAlamatEmail(String[] AlamatEmail) {
        this.AlamatEmail = AlamatEmail;
    }
}
