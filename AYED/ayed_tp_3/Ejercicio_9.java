package ayed_tp_3;

public class Ejercicio_9 {

	public static boolean esDeSeleccion (GeneralTree<Integer> arbol)
	{
		
		if(arbol==null)
		{
			return false;
		}
		
		if(!arbol.isLeaf())
		{
			
			int j = Integer.MAX_VALUE;
			
			for(GeneralTree<Integer> ab : arbol.getChildren())
			{
				
				if(j<ab.getData())
				{
					j=ab.getData();
				}
				
			}
			
			if(j != arbol.getData())
			{
				return false;
			}
			
			for(GeneralTree<Integer> ab : arbol.getChildren())
			{
				boolean b = esDeSeleccion(ab);
				
				if(!b)
				{
					return false;
				}
				
			}
			
		}
		
		return true;
		
	}
	
}
