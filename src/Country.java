import java.util.Objects;

public class Country {
    String name;
    int people;
    int indexCritic;

    public Country(String name, int people, int indexCritic) {
        this.name = name;
        this.people = people;
        this.indexCritic = indexCritic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return people == country.people && indexCritic == country.indexCritic && Objects.equals(name, country.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, people, indexCritic);
    }
}
