package minggu8;

public class postfix {

    int n, top;
    char stack[];

    public postfix(int total) {

        n = total;
        top = -1;
        stack = new char[n];
        push('(');
    }

    public void push(char c) {
        top++;
        stack[top] = c;
    }

    public char pop() {
        char item = stack[top];
        top--;
        return item;
    }

    public boolean isOperator(char c) {
        if (c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+') {
            return true;
        } else {
            return false;
        }
    }
    public boolean isOperand(char c){
        if ((c>='A'&&c<='z')||(c>='a'&&c<='z')||(c>='0'&&c<='9')||c==' '||c=='.') {
            return true;
        } else {
            return false;
        }
    }

    public int presedence(char c) {
        switch (c) {
            case '^':
                return 3;
            case '%':
                return 2;
            case '/':
                return 2;
            case '*':
                return 2;
            case '-':
                return 1;
            case '+':
                return 1;
            default:
                return 0;
        }
    }

    public String konversi(String q) {
        String P = "";
        char c;
        for (int i = 0; i < n; i++) {
            c = q.charAt(i);
            if (isOperand(c)) {
                P = P + c;
            }
            if (c == '(') {
                push(c);
            }
            if (c == ')') {
                while (stack[top] != '(') {
                    P = P + pop();
                }
                char temp = pop();
            }
            if (isOperator(c)) {
                while (presedence(stack[top]) >= presedence(c)) {
                    P = P + pop();
                }
                push(c);
            }
        }
        return P;
    }
}
