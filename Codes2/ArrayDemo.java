class W
{
	
}
public class ArrayDemo {

	public static void main(String[] args) {
		W obj = new W();
		System.out.println(obj);
		String song = "It's My Life";
		String songs[]={"It's My Life","Bang Bang","Boom Boom"};
		int []m = new int[5];
		System.out.println(m);
		int g[] = new int[]{10,20,30,40,50};
		String cc = new String("Hello");
		int x[]  = new int[5];
		int y[] = {10,20,30,40,50};
		
		System.out.println(songs.length);
		/*for(int i = 0; i<songs.length; i++){
			System.out.println(songs[i]);
		}*/
		// Enhance for Loop (Array Traverse)
		for(String s : songs){
			System.out.println(s);
		}
		int s[] = {10,20,30};
		for(int i : s){
			System.out.println(i);
		}
		int []arr[]={{10,20,30},{1,2,3,4,5,6,7,8,9,10},{10,20,30,40,50}};
		/*
		int arr[][] = new int[3][];
		arr[0] = new int[10];
		arr[1] = new int[20];
		arr[2] = new int[30];
		*/
		for(int i[] : arr){
			for(int j : i){
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		/*
		for(int i = 0 ; i<arr.length; i++){
			for(int j= 0 ; j<arr[i].length; j++){
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}*/
		System.out.println(arr);
	}

}
