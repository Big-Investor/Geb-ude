
/**
 * Beschreiben Sie hier die Klasse Dorf.
 * 
 * @author Tim
 * @version 1.0
 */
public class Dorf
{
    Gebaeude dorfgebaeude[] = new Gebaeude[7];
    
    public Dorf()
    {
        dorfgebaeude[0] = new Einfamilienhaus(3,5,5);
        dorfgebaeude[1] = new Einfamilienhaus(5,2,10);
        dorfgebaeude[2] = new Einfamilienhaus(4,1,13);
        dorfgebaeude[3] = new Hochhaus(2.5,4,4);
        dorfgebaeude[4] = new Hochhaus(5,3,10);
        dorfgebaeude[5] = new Hochhaus(4.5,5,9);
        dorfgebaeude[6] = new Kathedrale(30,87);
    }
    
    public int besucher()
    {
        int summe = 0;
        
        for(int i=0;i < dorfgebaeude.length;i++)
        {
            summe = summe + dorfgebaeude[i].anzahlBesucher();
        }
        
        return summe;
    }
    
    public void ersteVeraenderung()
    {
         gebaudeHinzufuegen(new Hochhaus(2,5,9)); 
         gebaudeHinzufuegen(new Dom(25, 68));
    }
    
    public void zweiteVeraenderung()
    {
         gebaudeHinzufuegen(new Hochhaus(2.4,6,13));
         gebaudeHinzufuegen(new Hochhaus(2.7,4,7));
         gebaudeHinzufuegen(new Kathedrale(22, 78));
    }
    
    public void gebaudeHinzufuegen(Gebaeude pGebaeude)
    {
        Gebaeude[] dorfgebaeudeNeu = new Gebaeude[dorfgebaeude.length+1];
        for(int i = 0; i<dorfgebaeude.length; i++)
        {
            dorfgebaeudeNeu[i]=dorfgebaeude[i]; 
        }
        dorfgebaeudeNeu[dorfgebaeudeNeu.length-1]=pGebaeude;
        dorfgebaeude = dorfgebaeudeNeu;
    }
}
