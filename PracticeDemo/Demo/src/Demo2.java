

public class Demo2 {

//	0, 1, 1, 2, 3, 5
//	static int fib(int n) {
//		if(n <= 1) {
//			return n;
//		}
//		return fib(n - 2) + fib(n - 1);
//	}
//	static int binary(int [] arr, int n) {
//		int l = 0, r = arr.length - 1;
//		while(l <= r) {
//			int mid = l + r;
//			if(arr[mid] == n) {
//				return mid;
//			}
//			if(arr[mid] < n) {
//				l++;
//			}
//			else {
//				r--;
//			}
//		}
//		return -1;
//	}
	static char[] swap(String str, int i, int j)
    {
        char ch[] = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return ch;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] arr = {-1, 0, 5, 7, 8, 10};
//		int n = 7;
//		int index = binary(arr, n);
//		System.out.println(index);
//		String a = "a,b$c";
//		
//		int l = 0, r = a.length() - 1;
//		while(l <= r) {
//			if(a.charAt(l) <= 'z' && a.charAt(l) >= 'a' 
//					&& a.charAt(r) <= 'z' && a.charAt(r) >= 'a') {
//				a = String.valueOf(swap(a, l, r));
//				l++;
//				r--;
//			}
//			else if(a.charAt(l) > 'z' && a.charAt(l) < 'a') {
//				l++;
//			}
//			else {
//				r--;
//			}
//		}
//		System.out.println(a);
		
		int a = 0, b = 1;
		System.out.print(a + " " + b);
		for(int i = 2; i < 19; i++) {
			int z = a + b;
			a = b;
			b = z;
			System.out.print(" " + z);
		}
	}

}
