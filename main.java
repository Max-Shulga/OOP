public class main {
    public static void main(String[] args) {
        Man pol = new Man("Pol",22);
        Man max = new Man("Max", 29);
        Children kid1 = new Children("asd",2);
        Man vv = new Man();
        Children carl = new Children("Polla", 2);
        pol.relations.addRelation(max, Relations.relationTypes.SIBLING);
        pol.relations.addRelation(carl, Relations.relationTypes.CHILD);
        pol.relations.addRelation(kid1, Relations.relationTypes.SIBLING);
        pol.relations.addRelation(vv,Relations.relationTypes.SIBLING);
        pol.relations.showArchive();
        System.out.println(pol.relations.getSampling(Relations.relationTypes.SIBLING));

    }
}
