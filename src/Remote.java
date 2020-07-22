
 interface Remote {
	 
	 int increasevolume(int volume);
	 int decreasevolume(int volume);
	 boolean powerswitch(boolean powerstatus);

}

 
 class TVRemote implements Remote{
	 
	 

	@Override
	public int increasevolume(int volume) {
		
		return volume++;
	}

	@Override
	public int decreasevolume(int volume) {
		// TODO Auto-generated method stub
		return volume--;
	}

	@Override
	public boolean powerswitch(boolean status) {
		// TODO Auto-generated method stub
		return status;
	}
	 
 }
 
 
 class ACRemote implements Remote{

	@Override
	public int increasevolume(int volume) {
		// TODO Auto-generated method stub
		return volume+2;
	}

	@Override
	public int decreasevolume(int volume) {
		// TODO Auto-generated method stub
		return volume-2;
	}

	@Override
	public boolean powerswitch(boolean powerstatus) {
		// TODO Auto-generated method stub
		return powerstatus;
	}
	 
 }