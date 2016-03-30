package tugas.bab4;

public class BukuAlamat {

    private String nama[] = {"Atikah Febrianti Nastiti", "Adelia Ayu Trilestari", "Lasma Triani", "Dorothy Gabriel", "Faiz Hisyam Putra"};
    private String alamat[] = {"Jl Kedawung Gg III No 15", "Jl Tarupala", "Jl MT. Haryono(Kav A) No 1", "Mayjen Panjaitan", "Jl Kedawung No 15"};
    private String notel[] = {"085736782021", "082139261850", "085247643000", "085311542788", "083834429171"};
    private String email[] = {"atikahfn02@gmail.com", "adeliaayu53@gmail.com", "lasmatriani@gmail.com", "gabriel@gmail.com", "faizhisyam12@gmail.com"};

    public BukuAlamat() {
    }

    public void setNama(int idx, String nama) {
        this.nama[idx] = nama;
    }

    public String getNama(int idx) {
        return nama[idx];
    }

    public void setAlamat(int idx, String alamat) {
        this.alamat[idx] = alamat;
    }

    public String getAlamat(int idx) {
        return alamat[idx];
    }

    public void setNotel(int idx, String notel) {
        this.notel[idx] = notel;
    }

    public String getNotel(int idx) {
        return notel[idx];
    }

    public void setEmail(int idx, String email) {
        this.email[idx] = email;
    }

    public String getEmail(int idx) {
        return email[idx];
    }
}
