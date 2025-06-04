package ayed_tp_3;

import java.util.LinkedList;
import java.util.List;

public class Ejercicio_10 {

	
	public static List<Integer> resolver(GeneralTree<Integer> arbol)
	{
		
		List<Integer> l = new LinkedList<Integer>();
		
		if(arbol == null)
		{
			return null;
		}
		
		if(arbol.getData()==1)
		{
			l.add(arbol.getData());
		}
		
		return resolver(l,arbol);
		
	}
	
	private static List<Integer> resolver(List<Integer> l, GeneralTree<Integer> ab)
	{
		
		List<Integer> temp = new LinkedList<Integer>();
		temp.addAll(l);
		
		if(ab.getData()==1)
		{
			temp.add(1);
		}
		
		
		if(!ab.isLeaf())
		{
			
			List<Integer> finalList = temp;
			
			for(GeneralTree<Integer> ab2 : ab.getChildren())
			{
				
				List<Integer> aux = resolver(l, ab2);
				
				if(finalList.size()<aux.size())
				{
					finalList.removeAll(finalList);
					finalList.addAll(aux);
				}
				
			}
			
			temp = finalList;
			
		}
		
		return temp;
	}
	
}
