import java.util.ArrayList;
import java.util.List;

public class Relations {
      relationType relation;
      Human person1;
      Human person2;
      ArrayList<Relations> relationsArchive;

    public Relations(Human person1, Human person2, relationType type) {
        this.person1 = person1;
        this.person2 = person2;
        this.relation = type;
        this.relationsArchive = new ArrayList<>();
        this.relationsArchive.add(this);
    }

    public Human getPerson1() {
        return person1;
    }

    public Human getPerson2() {
        return person2;
    }

    public relationType getRelations() {
        return relation;
    }

    public void addRelations(Human person1, Human person2, relationType relations) {
        this.relationsArchive.add(new Relations(person1, person2, relations));
    }

    private List<Human> getChildren(Human person) {
        List<Human> children = new ArrayList<>();
        for (Relations relations : relationsArchive) {
            if (relations.getRelations() == relationType.PARENT) {
                if (relations.getPerson1() == person) {
                    children.add(relations.getPerson2());
                }
            }
        }
        return children;
    }
    public void showChildren(Human person){
        System.out.printf("All childrens ");
        List <Human> kids =  getChildren(person);
        System.out.println(kids);
    }

    public void showArchive() {
        System.out.println("All relations: \n");
        for (Relations relations : relationsArchive) {
            System.out.println(relations.getPerson1().toString());
            System.out.println(relations.getPerson2().toString());
            System.out.println(relations.getRelations());
        }
    }

    public enum relationType {
        PARENT,
        CHILD,
        SIBLING,
        SPOUSE,
        GRANDPARENT
    }
}

