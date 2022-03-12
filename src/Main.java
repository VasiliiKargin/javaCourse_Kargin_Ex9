public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Entity<ObjectNationalInteger> rus = new Entity<>("Russia", 646545645, 5, "Bank Russia", 54544,new ObjectNationalInteger(111111));
        Entity<ObjectNationalString> usa = new Entity<>("USA", 646545645, 5, "Bank Russia", 54544, new ObjectNationalString("654564"));
        System.out.println(rus.getGuid().getObject());
        System.out.println(usa.getGuid().getObject());
        System.out.println(rus);
        System.out.println(usa);
    }
}
/*
      //Entity usa = rus.clone();
        System.out.println(rus);
        System.out.println(usa);
        //usa.name="USA";
        //usa.nameOrg="OOO";
        System.out.println(rus);
        System.out.println(rus.equals(usa));
        System.out.println(rus.hashCode());
        System.out.println(usa.hashCode());
        System.out.println(usa);
        System.out.println(rus.equals(usa));
 */