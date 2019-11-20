package study.chap08_problem4;

public class OracleDao implements DataAccsessObject {

	@Override
	public void select() {
		System.out.println("Oracle DB에서 검색");

	}

	@Override
	public void insert() {
		System.out.println("Oracle DB에서 삽입");

	}

	@Override
	public void update() {
		System.out.println("Oracle DB에서 수정");

	}

	@Override
	public void delete() {
		System.out.println("Oracle DB에서 삭제");

	}

}
