package rojas.arturo.writer;

public class SimpleWriterImpl implements Writer{
    @Override
    public void write(String s) {
        System.out.println("+++++-->" + s);
    }
}
