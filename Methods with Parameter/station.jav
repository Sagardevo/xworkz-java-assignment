class station 
{
	public static void send(String item)
	{
		System.out.println("Station Name:"+item);
		delivery.accept(item);
	}
}