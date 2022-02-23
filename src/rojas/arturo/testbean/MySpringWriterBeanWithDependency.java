package rojas.arturo.testbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rojas.arturo.writer.Writer;

public class MySpringWriterBeanWithDependency {

    private Writer writer;

    @Autowired
    public void setWriter (Writer pWriter){
        this.writer = pWriter;
    }
    public void run(){
        String s = "Sample string";
        writer.write(s);
    }


}
