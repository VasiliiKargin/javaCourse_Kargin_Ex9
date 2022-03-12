public class ObjectNationalInteger implements National<Integer>{
    private Integer guid;
    //private String guid;

    public ObjectNationalInteger(Integer guid){
        this.guid=guid;
    }

    @Override
    public Integer getObject() {
        return this.guid;
    }
}
