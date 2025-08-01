package facade;

final class WorkflowManager {

    private final DataLoader loader;
    private final DataProcessor processor;
    private final ReportGenerator reporter;

    WorkflowManager() {
        this.loader = new DataLoader();
        this.processor = new DataProcessor();
        this.reporter = new ReportGenerator();
    }

    public void executeWorkflow() {
        loader.load();
        DataLoader.validate();
        loader.preprocess();

        processor.analyze();
        processor.transform();
        processor.summarize();

        reporter.generateReport();
    }
}

public class Main {

    public static void main(String[] args) {
        WorkflowManager workflow = new WorkflowManager();
        workflow.executeWorkflow();
    }
}
