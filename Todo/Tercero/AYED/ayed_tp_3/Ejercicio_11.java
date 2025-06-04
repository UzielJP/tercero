package ayed_tp_3;

public class Ejercicio_11 {
	
	public static boolean resolver(GeneralTree<Integer> arbol)
	{
		
		Queue<GeneralTree<Integer>> c = new Queue<GeneralTree<Integer>>();
		GeneralTree<Integer> aux;
		
		boolean ok = true;
		int cont = 0;
		int ant = 0;
		
		c.enqueue(arbol);
		c.enqueue(null);
		
		
		while(!c.isEmpty()&&(ok))
		{
			
			aux = c.dequeue();
			
			if(aux != null)
			{
				
				cont++;
				
				if(aux.hasChildren())
				{
					for (GeneralTree<Integer> a : aux.getChildren())
					{
						c.enqueue(a);
					}	
				}
				
			}
			else
			{
				
				if(cont <= ant)
				{
					ok=false;
				}
				else
				{
					
					if(!c.isEmpty())
					{
						c.enqueue(null);
						ant = cont;
						cont = 0;
					}
					
				}
				
				
			}
			
		}
		
		return ok;
		
		
	}
	
}