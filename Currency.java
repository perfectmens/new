class CurrencyConverter {
    double usd_rate, euro_rate, yen_rate;

    CurrencyConverter(double usd_rate, double euro_rate, double yen_rate) {
        this.usd_rate = usd_rate;
        this.euro_rate = euro_rate;
        this.yen_rate = yen_rate;
    }

    double dollar_to_rupee(double usd) {
        return usd * usd_rate;
    }

    double rupee_to_dollar(double inr) {
        return inr / usd_rate;
    }

    double euro_to_rupee(double euro) {
        return euro * euro_rate;
    }

    double rupee_to_euro(double inr) {
        return inr / euro_rate;
    }

    double yen_to_rupee(double yen) {
        return yen * yen_rate;
    }

    double rupee_to_yen(double inr) {
        return inr / yen_rate;
    }
}

// Example usage
CurrencyConverter converter = new CurrencyConverter(81.83, 79.06, 0.57);

// Convert 100 USD to INR
double inr = converter.dollar_to_rupee(100);
System.out.println(f"100 USD is equal to {inr} INR");

// Convert 500 INR to USD
double usd = converter.rupee_to_dollar(500);
System.out.println(f"500 INR is equal to {usd} USD");

// Convert 75 EUR to INR
inr = converter.euro_to_rupee(75);
System.out.println(f"75 EUR is equal to {inr} INR");

// Convert 2000 INR to EUR
double euro = converter.rupee_to_euro(2000);
System.out.println(f"2000 INR is equal to {euro} EUR");

// Convert 10000 YEN to INR
inr = converter.yen_to_rupee(10000);
System.out.println(f"10000 YEN is equal to {inr} INR");

// Convert 3000 INR to YEN
double yen = converter.rupee_to_yen(3000);
System.out.println(f"3000 INR is equal to {yen} YEN");
