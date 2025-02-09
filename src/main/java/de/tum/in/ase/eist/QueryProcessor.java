package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
        query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "C";
        } else if (query.contains("plus")) {
            String[] x = query.split(" ");
            for (int i = 0; i < x.length; i++) {
                if (x[i].equals("plus")) {
                    return "" + (Integer.parseInt(x[i - 1]) + Integer.parseInt(x[i + 1]));
                }
            }
        } else if (query.contains("multiplied")) {
            String[] x = query.split(" ");
            for (int i = 0; i < x.length; i++) {
                if (x[i].equals("multiplied")) {
                    return "" + (Integer.parseInt(x[i - 1]) * Integer.parseInt(x[i + 2]));
                }
            }
        } else { // TODO extend the programm here
            return "";
        }
        return "";
    }

}
