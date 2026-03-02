package ma.projet.classes;


import javax.persistence.*;
import java.util.List;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String cin;
    private String nom;
    private String prenom;
    private String telephone;
    private  String email;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Contrat> contrat;

    //contructeur
    public Client(){

    }

    //constructeur
    public Client(long id,String nom,String prenom,String telephone,String email,String cin){
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.telephone=telephone;
        this.email=email;
        this.cin=cin;
    }

    //getters and setters


    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public List<Contrat> getContrat() {
        return contrat;
    }

    public void setContrat(List<Contrat> contrat) {
        this.contrat = contrat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
