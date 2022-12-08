public class Manager {
    private String[] films = new String[0];
    private int limit;

    public Manager(int limit) {
        this.limit = limit;
    }

    public Manager() {
        this.limit = 10;
    }

    public void addFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int length;
        if (films.length < limit) {
            length = films.length;
        } else {
            length = limit;
        }

        String[] tmp = new String[length];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}
