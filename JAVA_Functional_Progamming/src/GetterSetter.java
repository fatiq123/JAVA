public class GetterSetter {
    private int variable;

    public int getVariable() {
        return variable;
    }

    public void setVariable(int variable) {
        this.variable = variable;
    }
}


class Class {
    public static void main(String[] args) {
        GetterSetter gs = new GetterSetter();
        gs.setVariable(1);
        System.out.println(gs.getVariable());
    }
}