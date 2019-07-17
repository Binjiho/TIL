package schoolproject2;

import schoolbusiness.*;
/**<p>School System에서 인적정보 관리의 비즈니스 로직을 담당할 객체의 클래스는
 *  SchoolModel 인터페이스를 구현해야 한다.
 *  
 *  <p>SchoolModel 객체는 아래와 같은 작업을 수행할 수 있어야 한다. 
 *  <ol>
 *   <li>새로운 사람 정보를 추가
 *   <li>사람 정보를 검색
 *   <li>사람 정보를 삭제
 *   <li>모든 사람 정보를 검색
 *   <li>데이터 영속성을 위한 영구 저장(파일, DB 등)
 *  </ol>
 *  <p>사람 정보의 관리는 내부적으로 Collection API를 사용할 것을 권장한다.
 */

public interface SchoolModel {
	
	/**<p>데이터 저장소에 새로운 사람 정보를 추가한다.
	 *  <p>데이터 저장소에 동일한 사람이 존재할 경우 SchoolException이 발생한다.
	 *   
	 * @param person 추가할 사람
	 * @throws SchoolException 동일한 사람이 존재할 경우
	 */
	public abstract void addPerson(Person person) throws SchoolException;
	
	/**<p>데이터 저장소에서 주어진 이름을 가진 사람 정보를 검색한다.
     *  <p>데이터 저장소에 검색된 사람이 존재하지 않을 경우 SchoolException이 발생한다.
     *   
	 * @param name 검색할 사람의 이름
	 * @return 검색된 사람
	 * @throws SchoolException 검색된 사람이 없는 경우
	 */
	Person findPerson(String name) throws SchoolException;

	/**<p>데이터 저장소에서 주어진 이름을 가진 사람 정보를 삭제한다.
	 *  <p>데이터 저장소에 삭제할 사람이 존재하지 않을 경우 SchoolException이 발생한다.
	 *   
	 * @param name 삭제할 사람의 이름
	 * @throws SchoolException 삭제할 사람이 없는 경우
	 */
	void deletePerson(String name) throws SchoolException;

	/**<p>데이터 저장소에 저장된 모든 사람의 정보를 구해준다.
	 * 
	 * @return 모든 사람 정보가 담긴 배열, 저장된 사람이 없는 경우 크기가 0인 배열을 반환
	 */
	Person[] getAllPersons();

	/**<p>SchoolModel 객체의 사용을 끝내기 전 정리작업을 위해 호출해야 하는 메소드.
     *  <p>데이터 저장소에 있는 모든 데이터는 안전하게 영속 저장이 보장되어야 하며,
     *  데이터의 영속 저장에 실패할 경우 SchoolException이 발생한다. 
     *  
	 * @throws SchoolException 데이터의 영속 저장에 실패할 경우
	 */
	void close() throws SchoolException;
	
}
