public class ObjectNational<K> implements National<K>{
    private final K entity;
    private String guid;

    public ObjectNational(K entity){
        this.entity=entity;
    }

    @Override
    public K getObject() {
        return this.entity;
    }
}
