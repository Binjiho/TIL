package schoolproject2;

import schoolbusiness.*;
/**<p>School System���� �������� ������ ����Ͻ� ������ ����� ��ü�� Ŭ������
 *  SchoolModel �������̽��� �����ؾ� �Ѵ�.
 *  
 *  <p>SchoolModel ��ü�� �Ʒ��� ���� �۾��� ������ �� �־�� �Ѵ�. 
 *  <ol>
 *   <li>���ο� ��� ������ �߰�
 *   <li>��� ������ �˻�
 *   <li>��� ������ ����
 *   <li>��� ��� ������ �˻�
 *   <li>������ ���Ӽ��� ���� ���� ����(����, DB ��)
 *  </ol>
 *  <p>��� ������ ������ ���������� Collection API�� ����� ���� �����Ѵ�.
 */

public interface SchoolModel {
	
	/**<p>������ ����ҿ� ���ο� ��� ������ �߰��Ѵ�.
	 *  <p>������ ����ҿ� ������ ����� ������ ��� SchoolException�� �߻��Ѵ�.
	 *   
	 * @param person �߰��� ���
	 * @throws SchoolException ������ ����� ������ ���
	 */
	public abstract void addPerson(Person person) throws SchoolException;
	
	/**<p>������ ����ҿ��� �־��� �̸��� ���� ��� ������ �˻��Ѵ�.
     *  <p>������ ����ҿ� �˻��� ����� �������� ���� ��� SchoolException�� �߻��Ѵ�.
     *   
	 * @param name �˻��� ����� �̸�
	 * @return �˻��� ���
	 * @throws SchoolException �˻��� ����� ���� ���
	 */
	Person findPerson(String name) throws SchoolException;

	/**<p>������ ����ҿ��� �־��� �̸��� ���� ��� ������ �����Ѵ�.
	 *  <p>������ ����ҿ� ������ ����� �������� ���� ��� SchoolException�� �߻��Ѵ�.
	 *   
	 * @param name ������ ����� �̸�
	 * @throws SchoolException ������ ����� ���� ���
	 */
	void deletePerson(String name) throws SchoolException;

	/**<p>������ ����ҿ� ����� ��� ����� ������ �����ش�.
	 * 
	 * @return ��� ��� ������ ��� �迭, ����� ����� ���� ��� ũ�Ⱑ 0�� �迭�� ��ȯ
	 */
	Person[] getAllPersons();

	/**<p>SchoolModel ��ü�� ����� ������ �� �����۾��� ���� ȣ���ؾ� �ϴ� �޼ҵ�.
     *  <p>������ ����ҿ� �ִ� ��� �����ʹ� �����ϰ� ���� ������ ����Ǿ�� �ϸ�,
     *  �������� ���� ���忡 ������ ��� SchoolException�� �߻��Ѵ�. 
     *  
	 * @throws SchoolException �������� ���� ���忡 ������ ���
	 */
	void close() throws SchoolException;
	
}
