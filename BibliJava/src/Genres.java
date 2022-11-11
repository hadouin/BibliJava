public enum Genres {
    FANTASY ("fantasy"),
    SCIENCE_FICTION ("science-fiction"),
    COMEDIE_ROMANTIQUE("comédie romantique");

    private final String displayName;
    Genres(String displayName) {
        this.displayName = displayName;
    }
}
