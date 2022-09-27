import java.util.*;
public class Main {



    //פעולה שמעתיקה stack ומחזירה העתק שלו בלי להרוס את המקורי
    static void clonestack(Stack<Integer> st, Stack<Integer> cloned)
    {
        if(st.isEmpty()){
            return;
        }
        while(!st.isEmpty()){
            cloned.push(st.pop());
        }
        if(cloned.size()==1){
            return;
        }
        for(int i = 0;i < cloned.size();i++){
            int x = cloned.pop();
            while(cloned.size()!=i){
                st.push(cloned.pop());
            }
            cloned.push(x);
            while(!st.isEmpty()){
                cloned.push(st.pop());
            }
        }
    }

    //(בתנאי שיש מספרים בסטק )פעולה שמחזירה את המספר הגדול ב stack בלי להרוס את stack
    static int biggestNum(Stack<Integer> st)
    {
        int sum;
        Stack<Integer> temp1 = new Stack<>();
        sum = st.peek();

            //לולאה שמשווה את המספרים בסטק לsum ןמניסה לסטק אחר את המספרים
            while (!st.isEmpty()) {
                if (st.peek() >= sum) {
                    sum = st.peek();
                }
                temp1.push(st.pop());
            }
            //מחזירים את המספרים לסטק המקורי
            while (!temp1.isEmpty()) {
                st.push(temp1.pop());
            }
            return sum;
    }




    //פעולה שמוחקת מספר מהstack ומחזירה את הסטק המקורי בלי המספר
     public static Stack<Integer> removeFromStack(Stack<Integer> st,int num)
    {
        if (st.isEmpty())
        {
             return st;
        }
        else
        {
            Stack<java.lang.Integer> temp1 = new Stack<>();
            while (!st.isEmpty())
            {
             if (st.peek()==num)
             {
                 st.pop();
                 while (!temp1.isEmpty())
                 {
                     st.push(temp1.pop());
                 }
                 return st;

             }
                while (!temp1.isEmpty())
                {
                    st.push(temp1.pop());
                }
                return st;

            }

        }
    }

    //פעולה שמקבלת מחסנית ומספר ומוצאת כמה סדרות חשבוניות עם ההפרש של של המספר קיימות
    // (סדרה חשבונית לפחות 3 מספרים) (לא שומר על המחסנית מקורית)
    static int difference3(Stack<Integer> st,int d)
    {
        if (st.isEmpty())
        {
            return 0;
        }
        else
        {
            int count1=0,count2=0,x1;
            while (!st.isEmpty())
            {
                x1=st.pop();
                while (st.peek()-x1==d)
                {
                    if (!st.isEmpty())
                    {
                        x1 = st.pop();
                        count2++;
                    }
                }
                if (count2>=2)
                {
                    count1++;
                }
            }
            return count1;
        }

    }









    public static void main(String[] args)
    {
        Stack stack = new Stack(7);

        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);



        System.out.println("Hello world!");
    }
}