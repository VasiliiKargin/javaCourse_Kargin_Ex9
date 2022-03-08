public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Entity<Integer> rus = new Entity<K>("Russia", 646545645, 5, "Bank Russia", 54544, 111111);
        Entity2<String> usa = new Entity2<K>("USA", 646545645, 5, "Bank Russia", 54544, "654564");
        ObjectNational<Entity> nat = new ObjectNational<>(rus);
        System.out.println(nat.getObject().getGuid());
        ObjectNational<Entity2> nat2 = new ObjectNational<>(usa);
        System.out.println(nat2.getObject().getGuid());
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