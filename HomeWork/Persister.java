public class Persister<T extends Saveble>{
	private T item;
	
	public Persister(T item){
		this.item = item;
	}
	
	public void save(String info){
		System.out.println("Save: \n" + info); // подробное текстовое описание целесообразно вынести в сохраняемые классы
	}
}