public class test{
	public static void main(String[] args) {
		SequentialSearchST<String, Integer> obj = new SequentialSearchST<String, Integer>();
		obj.put("bhu",3);
		obj.put("calc",6);
		obj.put("down",10);

		obj.delete("bhu");
		System.out.println(obj.keys());

		 
        
        System.out.println(obj.isEmpty());


        System.out.println(obj.size());



	}
}