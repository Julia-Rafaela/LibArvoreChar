package model;

public interface IAarvore {
	public void insert(char valor);
	public void search(char valor) throws Exception;
	public void remove(char valor) throws Exception;
	public void prefixSearch() throws Exception;
	public void infixSearch() throws Exception;
	public void postfixSearch() throws Exception;

}
