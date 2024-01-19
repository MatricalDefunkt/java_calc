public class Calculator {
    private int op1;
    private int op2;
    private float result;

    public Calculator(int op1, int op2) {
        this.op1 = op1;
        this.op2 = op2;
    }

    public void add() {
        result = op1 + op2;
    }

    public void subtract() {
        result = op1 - op2;
    }

    public void multiply() {
        result = op1 * op2;
    }

    public void divide() {
        result = op1 / op2;
    }

    public float getResult() {
        return result;
    }
}