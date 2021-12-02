package gof.dp.builder;

public class ChicagoPizza extends Pizza{

    private final boolean sauceInside;

    public static class Builder extends Pizza.Builder{

        private boolean sauceInside = false;

        public Builder sauceInside(){
            sauceInside = true;
            return this;
        }

        @Override
        Pizza build() {
            return new ChicagoPizza(this);
        }

        @Override
        protected Pizza.Builder self() {
            return this;
        }
    }


    ChicagoPizza(Builder builder) {
        super(builder);
        this.sauceInside = builder.sauceInside;
    }

    public String toString() {
        return toppings.toString() + " sauceInside: " + sauceInside;
    }

}
