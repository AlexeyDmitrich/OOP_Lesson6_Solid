public class User implements Saveble, Reportable {
    private String name;
    private Persister persister = new Persister(this); // Создание экземпляра вынесено из метода save (Single responsibility)
    private Reporter reporter = new Reporter(this);  // Для соблюдения Open-Close создан отдельный класс для репорта
    /*
     * Для возможных безопасных расширений созданы интерфейсы сохраняемости и репортируемости,
     * Любой следующий объект, создаваемый с расчётом на сохранение и/или репорт,
     * должен имплеминтировать соответствующие интерфейсы, что даст возможность
     * использовать логику классов Persister и Reporter без дополнительных танцев с бубном.
     */

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void save() {
        this.persister.save(this.toString());
    }

    @Override
    public void report() {
        reporter.report(this.toString());
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res
				.append("user ")
                .append(this.name)
				.append("\n");
        return res.toString();
    }
}