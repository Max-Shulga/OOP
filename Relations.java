import interfaces.getProto;
import java.util.ArrayList;
import java.util.List;

public class Relations {
    /**
     * Prototype to which links will be attached / прототип к которому будут прекрепляться связи
     */
    getProto mainPerson;
    /**
     * The prototype to be prefixed / прототип который будет прекреплен
     */
    getProto relationPerson;

    /**
     * Types of kinship / Виды родственных связей
     */
    relationTypes relationType;
    /**
     * an archive of all relatives / архив всех родственников
     */
    ArrayList<Relations> relationsArchive = new ArrayList<>();

    /**
     * constructor for the class / конструктор для класса
     */
    public Relations(getProto mainPerson) {
        this.mainPerson = mainPerson;
    }

    /**
     * constructor to add links / конструктор для добавления связей
     */
    private Relations(getProto person, relationTypes relType) {
        this.relationPerson = person;
        this.relationType = relType;
    }

    /**
     * @proto the method for adding kinship links / метод на добавление родственных связей
     * @Arg1: specimen of the class with which there is kinship / Экземпляр класа с которым есть родство
     * @Arg2: relation type / тип родства
     */
    public void addRelation(getProto person, relationTypes relType) {

        this.relationsArchive.add(new Relations(person, relType));
    }

    private Object getPerson() {
        return relationPerson;
    }

    private relationTypes getRelations() {
        return relationType;
    }

    /**
     * @proto display all relations
     */
    public void showArchive() {

        System.out.println("All relations of " + mainPerson);
        for (Relations relations : relationsArchive) {
            System.out.println(relations.getPerson().toString());
            System.out.println(relations.getRelations());
        }
    }

    public List<getProto> getSampling(relationTypes relType) {
        List<getProto> sampling = new ArrayList<>();
        for (Relations rel : relationsArchive) {
            if (rel.getRelations() == relType) {
                sampling.add((getProto) rel.getPerson());
            }
        }
        return sampling;
    }

    public enum relationTypes {
        PARENT,
        CHILD,
        SIBLING,
        SPOUSE,
        GRANDPARENT
    }
}

