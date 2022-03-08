import java.util.Objects;

public class Entity2<K extends National> extends Country implements  Cloneable {
    String nameOrg;
    int countClient;
    private K guid;

    public K getGuid() {
        return guid;
    }

    public void setGuid(K guid) {
        this.guid = guid;
    }

    Entity2(String name, int people, int indexCritic, String nameOrg, int countClient, K guid) {
        super(name, people, indexCritic);
        this.nameOrg = nameOrg;
        this.countClient = countClient;
        this.guid=guid;
    }

    @Override
    public String toString() {
        return "Страна = " + name +
                ", Количество людей = " + people +
                ", Индекс критичности страны = " + indexCritic +
                ", Название организации = " + nameOrg +
                ", Количество клиентов у организации = " + countClient + " Идентификатор Организации: " + guid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return countClient == entity.countClient && Objects.equals(nameOrg, entity.nameOrg)
                && name == entity.name && people ==entity.people && indexCritic==entity.indexCritic;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOrg, countClient) + 13 * 17;
    }

    @Override
    public Entity clone() throws CloneNotSupportedException {
        Country country= (Country) super.clone();
        return (Entity) super.clone();
    }


}