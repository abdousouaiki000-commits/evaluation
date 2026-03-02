package ma.projet.classes;


import javax.persistence.*;
import java.util.List;

@Entity
public class Assurance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String type;
    private double montant;
    private String converture;


    @OneToMany(mappedBy = "assurance", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Contrat> contrat;


    //constructeur
    public Assurance(){

    }


    //constructeur
    public Assurance(long id,String type,double montant,String converture){
        this.id=id;
        this.type=type;
        this.montant=montant;
        this.converture=converture;
    }

    //getters and setters



    public String getConverture() {
        return converture;
    }

    public void setConverture(String converture) {
        this.converture = converture;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
