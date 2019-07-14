package schoolproject;
//ArrayList ����
import java.util.*;
import javax.swing.plaf.synth.SynthSplitPaneUI;
import schoolbusiness.*;

public class SchoolManager extends Person {
	private Person [] personDB;
	private Person findp;
//	List<Person> personDB = new ArrayList<>();
	private int count;

	public SchoolManager() {
		personDB = new Person[4]; //200������ ����
		count=0;
	}
	
//	1.���
	public void registerPerson(Person p) {
		personDB[count++]=p;
		System.out.println("����Ƚ��:"+ count);
		personDB[count-1].printinfo();
	}
	
//  2.ã��
	public Person findPerson(String name) {
		for (int i = 0; i < personDB.length; i++) {
			if (name.equals(personDB[i].getName())) {
				findp = personDB[i];				
			}
		}
		return findp;
	}

//  3.����
	public Person[] deletePerson(String name) {
		for (int i = 0; i < personDB.length; i++) {
			if (name.equals(personDB[i].getName())) {
				for (int j = i; j < personDB.length -1; j++) {
					personDB[j] = personDB[i + 1];
					personDB[j].printinfo2();
				}
			}
		}
		System.out.println(name + "���� �����Ͱ� �����Ǿ����ϴ�.");
		return personDB;
	}
	
//	4.��ü���
	public Person[] getAllPersons() {

		return personDB;
	}
}
