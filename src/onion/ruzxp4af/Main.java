package onion.ruzxp4af;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("");
        list.add("s");
        list.add("st");
        list.add("str");
        list.add("str1");
        list.add("str11");
        list.add("str111");
        list.add("str1111");
       list.stream().map(x->x.length()>2?x+" 202 ":x+" ").forEach(System.out::print);
        System.out.println(list);


    }

}
class Car{
    private String q;
    private String w;
    Car(String q,String w){
        this.q=q;
        this.w=w;
    }

    @Override
    public String toString() {
        return "Car{" +
                "q='" + q + '\'' +
                ", w='" + w + '\'' +
                '}';
    }
}

