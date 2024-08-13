public class Main {
    public static void main(String[] args) {
        var services = new Pipeline<>(new ABCService())
                .addHandler(new DEFService())
                .addHandler(new XYZService());
        var input = "SAHH";
        System.out.println("Executing pipeline with input: " + input);
        var output = services.execute(input);
        System.out.println("Pipeline output: " + output);
    }
}
