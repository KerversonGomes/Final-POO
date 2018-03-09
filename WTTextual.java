package avaliacaofinal;
public class WTTextual {
	Skip to content
	This repository
	Search
	Pull requests
	Issues
	Marketplace
	Explore
	 @KerversonGomes
	 Sign out
	 Watch 0
	  Star 0
	  Fork 0 duarte15/Avalia-oFinal
	 Code  Issues 0  Pull requests 0  Projects 0  Wiki  Insights
	Branch: master Find file Copy path Avalia-oFinal/AvaliaçãoFinal.java
	aa7847e  17 seconds ago
	@duarte15 duarte15 Add files via upload
	1 contributor
	RawBlameHistory     
	36 lines (34 sloc)  1.02 KB
	package avaliaçãofinal;
	public class AvaliaçãoFinal {
	    public static void main(String[] args) throws WTDisconnectedException , MsgInvalidaExpection{
	        WTTextual wt = new WTTextual("e");
	        WTTextual wtt = new WTTextual("a");
	        wt.conectar();
	        wtt.conectar();
	        try{
	            wt.enviarMSG(wtt, 2);
	        }
	        catch (Exception c){
	            c.getMessage();
	        }
	        wt.desconectar();
	        System.out.println( "Usuário conectado: " + wt.estaOnline());
	        try{
	            wtt.enviarMSG(wt, 3);
	            System.out.println(wt.estaOnline());
	        }
	        catch(WTDisconnectedException b){
	            System.out.println(b.getMessage());
	        }
	        wt.conectar();
	        try{
	            wt.enviarMsg(wtt, null);
	        }
	        catch(WTDisconnectedException d){
	            System.out.println(d.getMessage());
	        }
	        catch (MsgInvalidaExpection f){
	            System.out.println(f.getMessage());
	        }
	    }
	    
	}
	© 2018 GitHub, Inc.
	Terms
	Privacy
	Security
	Status
	Help
	Contact GitHub
	API
	Training
	Shop
	Blog
	About
}
