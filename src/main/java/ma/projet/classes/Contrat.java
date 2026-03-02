package ma.projet.classes;


import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Temporal(TemporalType.DATE)
    private Date dateDebut;
    @Temporal(TemporalType.DATE)
    private Date datefin;


    // Stockage par ordinal (0, 1, 2...)
    @Enumerated(EnumType.ORDINAL)
    private StatutContrat statutOrdinal;

    // Stockage par nom (ACTIF, INACTIF, SUSPENDU)
    @Enumerated(EnumType.STRING)
    private StatutContrat statutString;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="assurance_id")
    private Assurance assurance;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="client_id")
    private Client client ;

    //contructeur
    public Contrat(){

    }
    //constructeur
    public Contrat(long id, Date dateDebut, Date datefin){
        this.id=id;
        this.dateDebut=dateDebut;
        this.datefin=datefin;
    }
//getters and setters


    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Assurance getAssurance() {
        return assurance;
    }

    public void setAssurance(Assurance assurance) {
        this.assurance = assurance;
    }

    public Date getDatefin() {
        return datefin;
    }

    public void setDatefin(Date datefin) {
        this.datefin = datefin;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public double getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
