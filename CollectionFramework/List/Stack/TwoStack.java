package CollectionFramework.List.Stack;

//Space Efficient Solution
public class TwoStack {
    int cap;
    int top1, top2;
    int[] arr;

    TwoStack(int n) {
        arr = new int[n];
        cap = n;
        top1 = -1;
        top2 = cap;
    }

    void push1(int x)
    {
        //you can only insert when top1 < top2-1 if top1 = top2-1 then we can not insert
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = x;
        }
        else {
            System.out.println("CollectionFramework.List.Stack Overflow");
            System.exit(1);
        }
    }

    void push2(int x)
    {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = x;
        }
        else {
            System.out.println("CollectionFramework.List.Stack Overflow");
            System.exit(1);
        }
    }

    int pop1()
    {
        if (top1 >= 0) {
            int x = arr[top1];
            top1--;
            return x;
        }
        else {
            System.out.println("CollectionFramework.List.Stack Underflow");
            System.exit(1);
        }
        return 0;
    }

    int pop2() {
        if (top2 < cap) {
            int x = arr[top2];
            top2++;
            return x;
        } else {
            System.out.println("CollectionFramework.List.Stack Underflow");
            System.exit(1);
        }
        return 0;
    }

    public static void main(String[] args) {
        TwoStack ts=new TwoStack(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        System.out.println("Popped element from stack1 is: " + ts.pop1());
        ts.push2(40);
        System.out.println("Popped element from stack2 is: " + ts.pop2());
    }
}
