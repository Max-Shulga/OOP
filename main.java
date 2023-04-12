public class main {
    public static void main(String[] args) {
        Man Max = new Man("Max", 22);
        Children kid = new Children("Dima", 2);
        Children kid2 = new Children("Kate", 4);
        Max.power = 10;

        kid.openCupboard();



        Relations relations = new Relations(Max, kid, Relations.relationType.PARENT);
        relations.addRelations(Max, kid2, Relations.relationType.PARENT);
        relations.showArchive();
        relations.showChildren(Max);
    }
}
