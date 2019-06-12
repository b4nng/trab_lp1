import java.util.Comparator;

public class CriterioAlfabetico implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Lance l1 = (Lance) o1;
		Lance l2 = (Lance) o2;
		
		return l1.getClienteName().compareTo(l2.getClienteName());
	}

}
