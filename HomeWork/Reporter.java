public class Reporter <T extends Reportable>{
    private T item;

    public Reporter(T item){
        this.item = item;
    }
    public void report(String info){
        System.out.println("Report: \n" + info); // подробное текстовое описание целесообразно вынести в репортируемые классы
    }
}
