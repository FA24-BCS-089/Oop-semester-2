
public abstract class Shape implements Drawable{
    private String name;
    public Shape(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double area();
    @Override
    public String toString(){
        return "Name:"+name;
    }
}
