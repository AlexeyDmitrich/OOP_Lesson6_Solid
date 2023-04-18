import java.util.Date;

public class Tester implements Reportable,Saveble{
    private String name;
    private Persister persister = new Persister(this); // Создание экземпляра вынесено из метода save (Single responsibility)
    private Reporter reporter = new Reporter(this);  // Для соблюдения Open-Close создан отдельный класс для репорта

    public Tester(String name) {
        this.name = name;
    }

    @Override
    public void save() {
        this.persister.save(this.toString());
    }

    @Override
    public void report() {
        StringBuilder rep = new StringBuilder();
        rep
                .append(this.toString())
                .append(new Date())
                .append("\n");
        this.reporter.report(rep.toString());
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res
                .append("Тестовый экземпляр - ")
                .append(this.name)
                .append("\n");
        return res.toString();
    }
}
