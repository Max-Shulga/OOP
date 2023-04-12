package Personas;

public class main {
    public static void main(String[] args){
        Man user = new Man();
        Woman maria = new Woman("Maria",22);
        Children kid1 = new Children("Bob",1);
        Children kid2 = new Children("Liza",2);
        Children kid3 = new Children("Tom",7);
        Man max = new Man("Max", "Ivanov",22);
        max.setCapital(1000);
        max.setInheritance("house,car,collectables");
        max.setBirthdate(1994,9,1);
        max.showInfo();
        max.relations.addRelation(kid1, Relations.relationTypes.CHILD);
        max.relations.addRelation(kid2, Relations.relationTypes.CHILD);
        max.relations.addRelation(kid3, Relations.relationTypes.CHILD);
        max.relations.addRelation(maria, Relations.relationTypes.SPOUSE);
        max.relations.addRelation(user, Relations.relationTypes.SIBLING);
        max.relations.showArchive();
        max.relations.getSampling(Relations.relationTypes.CHILD);
        max.showInfo();
        maria.caring(kid1);
        maria.caring(kid2);
    }
}
