class ABCService implements Handler<String, String> {
    @Override
    public String process(String input) {
        return input + "ABC";
    }
}

class DEFService implements Handler<String, String> {
    @Override
    public String process(String input) {
        return input + "DEF";
    }
}

class XYZService implements Handler<String, String> {
    @Override
    public String process(String input) {
        return input + "XYZ";
    }
}