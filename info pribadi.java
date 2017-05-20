package gluglu;

public class InfoPribadi {
    private String nama;
    private String nomor;
    private String email;
    private String alamat;
    private String jeniskelamin;
    public InfoPribadi(String nama, String nomor, String email, String alamat, String jeniskelamin){
        setNama(nama);
        setNomor(nomor);
        setEmail(email);
        setAlamat(alamat);
        setJenisKelamin(jeniskelamin);
    }
    public String getJenisKelamin(){
        return jeniskelamin;
    }
    public String getNama(){
        return nama;
    }
    public String getNomor(){
        return nomor;
    }
    public String getEmail(){
        return email;
    }
    public String getAlamat(){
        return alamat;
    }
    public void setJenisKelamin(String jk){
        jeniskelamin=jk;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public void setNomor(String nomor){
        this.nomor=nomor;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setAlamat(String alamat){
        this.alamat=alamat;
    }
}
