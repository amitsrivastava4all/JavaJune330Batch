class VV {
	int x = 1000;
}
class NN extends VV
{
	int x = 100;
}
class MM extends NN{
	int x = 200;
	MM(int x){
		int z = ((VV)this).x+((NN)this).x + this.x + x;
		System.out.println("Z is "+z);
	}
}
public class SuperVsThisPart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MM obj = new MM(1);

	}

}
