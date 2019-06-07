import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.Post;
import facebook4j.ResponseList;
import facebook4j.auth.AccessToken;

public class fbcmd {

	public static void main(String[] args) throws FacebookException {
		//
		
		Facebook facebook = new FacebookFactory().getInstance();
        facebook.setOAuthAppId("357072044947373", 
        		"5c55c05857859859d0216989784ac7dd");
        facebook.setOAuthAccessToken(new AccessToken("EAAFEwVBl960BAH6SIdUmmiS1iQedqhnLXZCWvewrSk5bYZCRzArHMYrmVytXEFKO39zvzU9ZCXA6RWyIvJaWNzvS4vlMrbV8KaiZAtLKvIXnzHyN5ktZCCqkcK1eJW6vw1P6ACs4aZChCQZBgFT0Hk6oz7bFq1ZBshcBiMzmlXf7aSMqnWLkVMaL9ZCt1JDrdmF0ZD"));
        
        //Obtener NewsFeed
        System.out.println("\tObtener mis publicaciones\n");
        ResponseList<Post> feed = facebook.getFeed();
        for (Post post : feed) {
            System.out.println(post);
        } 
        //Publicar en el Wall
        System.out.println("Nueva publicacion");
       facebook.postStatusMessage("Hello");
       
       //Publicar Link
       System.out.println("Nuevo link al muro");
       facebook.postLink("www.ultimateguitar.com",null, "Ultimate guitar");
	}	
}

