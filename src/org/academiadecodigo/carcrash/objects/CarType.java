package org.academiadecodigo.carcrash.objects;

/**
 * Created by codecadet on 02/02/16.
 */
public enum CarType {

    COUPE("C"),
    JAZZ("J"),
    COPCAR("P");

    private String symbol;


    CarType(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }


    @Override
    public String toString () {
        return "CarType{" +
                "symbol = '" + symbol + '\'' +
                '}';
    }
}