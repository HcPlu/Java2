package HW10;
 enum com {
		 DELL("Intel i3","Windous 10 ","4G"),
		 LENOVO("I5-7200u","Windous 10 ","8G"),
		 MACBOORPO("Inter i5","Mac os ","8G");
	 private com(String cpu,String system,String mainMeoryCapacity){
		 this.cpu =cpu;
		 this.mainMeoryCapacity = mainMeoryCapacity;
		 this.system = system;
	 }
		 private final String cpu;
		 private final String system;
		 private final String mainMeoryCapacity;
 public String getCpu(){return cpu+system+mainMeoryCapacity;}
 public String getmain(){return mainMeoryCapacity;}
 }

public  class Computer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		com c1=com.DELL;
		com c2=com.LENOVO;
		com c3=com.MACBOORPO;
		System.out.println(c1.getCpu());
		System.out.println(c2.getCpu());
		System.out.println(c3.getCpu());
		for(com c:com.values()){
			if(c.getmain().equals("8G"))
				System.out.println(c.getCpu());
		}

	}

}
