public class ObjectNationalString implements National<String>{
    private String guid;
    //private String guid;

    public ObjectNationalString(String guid){
        this.guid=guid;
    }

    @Override
    public String getObject() {
        return this.guid;
    }
}
