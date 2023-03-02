package collectionsdemo;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Comparator;
import java.util.LinkedHashSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Set<Integer>intset=new TreeSet<Integer>();
//       Set<Integer>inthset=new HashSet<Integer>();
//       Set<Integer>intlhset=new LinkedHashSet<Integer>();
       intset.add(10);
       intset.add(7);
       intset.add(3);
       intset.add(9);
       intset.add(2);
       System.out.println(intset);
//       System.out.println(inthset);
//       System.out.println(intlhset);
       
       
       Set<String>strset2=new TreeSet<String>(new StringComparator());
       strset2.add("Max");
       strset2.add("John");
       strset2.add("William");
       strset2.add("Robert");
       strset2.add("Zoe");
       System.out.println(strset2);
	}

}
//comparable-to provide natural ordering
//comparator-to change the natural ordering
class StringComparator implements Comparator<String>{
	@Override
	public int compare(String str1,String str2) {
		int l1=str1.length();
		int l2=str2.length();
		if(l1<l2) {
			return -1;
		}else if(l1>l2) {
			return 1;
		}else {
			return str1.compareTo(str2);
		}
	}
}
