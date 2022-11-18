public abstract class Ressource {
    Genres genre;
    String Name;
    int id;

    public Ressource(Genres genre, String name, int id){
        this.Name = name;
        this.genre = genre;
        this.id = id;
    }
}
