class minutes{
	public int min;
	public void minutes(int min){
		int yr, day;
		yr = min / 31536000;
		day = (min%31536000)/86400;
		System.out.println(min + "mins == " + yr + "year and " + day + "days" );
	}
	

}


public class year{
	public static void main(String[] args){
		minutes obj = new minutes();
		obj.min = 63331200;
		obj.minutes(obj.min);
	}
}
