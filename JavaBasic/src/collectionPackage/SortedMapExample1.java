package collectionPackage;

import java.util.Comparator;
import java.util.Map;

public interface SortedMapExample1<K,V> extends Map<K,V>{
	Comparator<? super K> comparator();
	SortedMapExample1<K,V> subMap(K fromKey , K toKey);
	SortedMapExample1<K,V> headMap(K toKey);
	SortedMapExample1<K,V> tailMap(K fromKey);
	K firstKey();
	K lastKey();

}
