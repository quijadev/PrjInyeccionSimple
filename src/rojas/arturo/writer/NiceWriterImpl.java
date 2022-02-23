package rojas.arturo.writer;

public class NiceWriterImpl implements Writer{
    @Override
    public void write(String s) {
        System.out.println("The string is " + s);
    }
}
