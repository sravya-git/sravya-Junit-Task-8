package junit;

public class RemoveInitialA {
	public String removeInitialA(String s)
	{
		String news="";
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='A' && i<2)
			{
				continue;
				
			}
			news+=s.charAt(i);
		}
		
		
		return news;
	}

}
