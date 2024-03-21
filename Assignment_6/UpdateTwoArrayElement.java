package Assignment_6;

import java.util.Vector;

public class UpdateTwoArrayElement {
	static void Queries(int arr[], int N,
            int [][]Q)
{
Vector<Integer> dq = new Vector<>();
for (int i = 0; i < N; i++) 
{
dq.add(arr[i]);
}
int sz = Q.length;
for (int i = 0; i < sz; i++) 
{
if (Q[i][0] == 0) 
{
int front = dq.get(0);
dq.remove(0);
dq.add(front);
}
else if (Q[i][0] == 1) 
{
int back = dq.elementAt(dq.size() - 1);
dq.remove(dq.size() - 1);
dq.add(0, back);
}
else if (Q[i][0] == 2) 
{
dq.set(Q[i][1], Q[i][2]);
}
else
{
System.out.print(dq.get(Q[i][1]) + " ");
}
}
}
public static void main(String[] args)
{
int arr[] = {1, 2, 3, 4, 5};
int N = arr.length;
int [][]Q = {{0}, {1}, {3, 1}, 
       {2, 2, 54}, {3, 2}};
Queries(arr, N, Q);
}

}
