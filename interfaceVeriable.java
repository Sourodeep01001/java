public class interfaceVeriable {
    public static void main(String[] args) {
        costomersun obj = new sellorraj();
        obj.purchese();
    }
}

interface costomersun {
    int amt = 5;

    void purchese();// Public + abstract
}

class sellorraj implements costomersun {
    @Override
    public void purchese() {
        // amt = 7 Final
        System.out.println("Raj needs" + amt + "kg rise");
        System.out.println(costomersun.amt);// prove static
    }
}
