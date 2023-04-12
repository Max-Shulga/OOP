/*
 * содержался как вложеный во всех наследниках человека
 * 1)У каждого экземпляра свой архив со связями
 * 2)добавление только родственика и связи(Это значит что архив именной?)
 * 3)
 * */

import interfaces.getProto;

import java.util.ArrayList;

public class Relations {
    getProto mainPerson;
    getProto relationPerson;
    relationTypes relationType;

    /**
     * @proto relationType : Types of kinship / Виды родственных связей
     */
    public enum relationTypes {
        PARENT,
        CHILD,
        SIBLING,
        SPOUSE,
        GRANDPARENT
    }

    /**
     * @proto relationsArchive : an archive of all relatives / архив всех родственников
     */
    ArrayList<Relations> relationsArchive = new ArrayList<>();

    /**
     * первый аргумент то кого добавлем 2 тип отношений
     */

    private Relations(getProto person, relationTypes rt) {
        this.relationPerson = person;
        this.relationType = rt;
    }

    /**
     * @proto addRelation : the method for adding kinship links / метод на добавление родственных связей
     * @proto person : A specimen of the class with which there is kinship / Экземпляр класа с которым есть родство
     * @proto relType:  relation type / тип родства
     * */
    public void addRelation(getProto person, relationTypes relType) {
        this.relationsArchive.add(new Relations(person, relType));
    }
    public Object getPerson(){
        return  relationPerson;
}
        public relationTypes getRelations() {
        return relationType;
    }
    public void showArchive() {
        System.out.println("All relations: \n");
        for (Relations relations : relationsArchive) {
            System.out.println(relations.getPerson().toString());
            System.out.println(relations.getRelations());
        }
    }


//      relationType relation;
//     getProto person;
//      Human person2;
//      ArrayList<Relations> relationsArchive;
//
//    public Relations(Human person1, getProto person, relationType type) {
//        this.person1 = person1;
//        this.person2 = person2;
//        this.relation = type;
//        this.relationsArchive = new ArrayList<>();
//        this.relationsArchive.add(this);
//    }
//
//    public Human getPerson1() {
//        return person1;
//    }
//
//    public Human getPerson2() {
//        return person2;
//    }
//
//    public relationType getRelations() {
//        return relation;
//    }
//
//    public void addRelations(Human person1, Human person2, relationType relations) {
//        this.relationsArchive.add(new Relations(person1, person2, relations));
//    }
//
//    private List<Human> getChildren(Human person) {
//        List<Human> children = new ArrayList<>();
//        for (Relations relations : relationsArchive) {
//            if (relations.getRelations() == relationType.PARENT) {
//                if (relations.getPerson1() == person) {
//                    children.add(relations.getPerson2());
//                }
//            }
//        }
//        return children;
//    }
//    public void showChildren(Human person){
//        System.out.printf("All childrens ");
//        List <Human> kids =  getChildren(person);
//        System.out.println(kids);
//    }
//
//    public void showArchive() {
//        System.out.println("All relations: \n");
//        for (Relations relations : relationsArchive) {
//            System.out.println(relations.getPerson1().toString());
//            System.out.println(relations.getPerson2().toString());
//            System.out.println(relations.getRelations());
//        }
//    }
//
//    public enum relationType {
//        PARENT,
//        CHILD,
//        SIBLING,
//        SPOUSE,
//        GRANDPARENT
//    }
}

