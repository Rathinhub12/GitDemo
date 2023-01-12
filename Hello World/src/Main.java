
public class Main {

	public static void DoPrint(Parent o) {
        o.print();
    }
    
    public static void main(String[] args) {
     Parent x = new Parent();    
     Parent y = new Child();
     Child z = new Child();
     DoPrint(x);
     DoPrint(y);
     DoPrint(z);

}
}
