import java.util.ArrayList;
import java.util.List;

public class Bibli {
    public int codePostal;
    public String name;
    List<Ressource> resources;
    List<Emprunt> emprunts;

    public Bibli(String name, int codePostal) {
        this.codePostal = codePostal;
        this.name = name;
        resources = new ArrayList<Ressource>();
        emprunts = new ArrayList<Emprunt>();
    }
}
