import java.util.ArrayList;
import java.util.List;

public class StringListBox implements ListBox<String> {
	List<String> list = new ArrayList<>();
	
	@Override
	public void addElements(String[] values) {
		list.addAll( List.of(values) );
		
	}

	@Override
	public void addElement(String value) {
		list.add(value);		
	}

	@Override
	public List<String> getElements() {
		
		return list;
	}

}
