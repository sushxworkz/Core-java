class SpotifyRunner{

	public static void main(String[] spotify){
	
		boolean isSpotifyAccountCreated=Spotify.createUserSpotifyAccount(96111838111L,"sushmita78@gmail.com","Sushmita3894","Sushmita",null);
		
		if(isSpotifyAccountCreated==true)
		Spotify. readUserSpotifyAccountDetails();
	}
}