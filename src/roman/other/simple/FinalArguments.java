package roman.other.simple;

class Gizmo{
    public void spin(){
        System.out.println("The \"spin\" method");
    }
}

public class FinalArguments{
    public void with(final Gizmo g){
//        g = new Gizmo();
    }
    public void without(Gizmo g){
        g = new Gizmo();
        g.spin();
    }

    public int g(final int i){
        return i + 1;
    }

    public static void main(String[] args) {
        FinalArguments finalArguments = new FinalArguments();
        finalArguments.without(null);
        finalArguments.with(null);

    }
}