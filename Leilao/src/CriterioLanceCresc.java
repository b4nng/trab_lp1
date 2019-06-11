import java.util.Comparator;

public class CriterioLanceCresc implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Lance l1 = (Lance) o1;
		Lance l2 = (Lance) o2;
		
		if(l1.getValor_lance() > l2.getValor_lance())
		{
			return 1;
		}
		else
		{
			if(l1.getValor_lance() < l2.getValor_lance())
			{
				return -1;
			}
			else
			{
				return 0;
			}
		}
		
	}

}
