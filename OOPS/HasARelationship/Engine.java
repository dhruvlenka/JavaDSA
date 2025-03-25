package OOPS.HasARelationship;

public class Engine {
    int hp;
    int strokes;
    String type;

    Engine() {

    }
    Engine( int hp, int strokes, String type){
        this.hp = hp;
        this.strokes = strokes;
        this.type = type;
    }
    public void getEngineDetails(){
        System.out.println("HP is: " + hp);
        System.out.println("Strokes are: " + strokes);
        System.out.println("Type is: " + type);
    }
}
