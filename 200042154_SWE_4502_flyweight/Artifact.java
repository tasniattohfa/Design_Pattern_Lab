public class Artifact {
    private String name;
    private String description;

    public Artifact(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void display(int locationX, int locationY) {
        System.out.println("Displaying '" + name + "' at location (" + locationX + ", " + locationY + ")");
        System.out.println("Description: " + description);
    }
}

//this class is for flyweight object representing a shared intrinsic state