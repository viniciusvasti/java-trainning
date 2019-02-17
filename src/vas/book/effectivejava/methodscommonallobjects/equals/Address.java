package vas.book.effectivejava.methodscommonallobjects.equals;

import java.util.Objects;

/**
 *
 * @author vinicius
 */
public class Address {

    private final String StreetOrAvenue;
    private final String City;
    private final String State;
    private final String ZipCode;
    private final String Country;

    public Address(String StreetOrAvenue, String City, String State, String ZipCode, String Country) {
        this.StreetOrAvenue = StreetOrAvenue;
        this.City = City;
        this.State = State;
        this.ZipCode = ZipCode;
        this.Country = Country;
    }

    public String getStreetOrAvenue() {
        return StreetOrAvenue;
    }

    public String getCity() {
        return City;
    }

    public String getState() {
        return State;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public String getCountry() {
        return Country;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.StreetOrAvenue);
        hash = 17 * hash + Objects.hashCode(this.City);
        hash = 17 * hash + Objects.hashCode(this.State);
        hash = 17 * hash + Objects.hashCode(this.ZipCode);
        hash = 17 * hash + Objects.hashCode(this.Country);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Address)) {
            return false;
        }
        final Address other = (Address) obj;
        if (!Objects.equals(this.StreetOrAvenue, other.StreetOrAvenue)) {
            return false;
        }
        if (!Objects.equals(this.City, other.City)) {
            return false;
        }
        if (!Objects.equals(this.State, other.State)) {
            return false;
        }
        if (!Objects.equals(this.ZipCode, other.ZipCode)) {
            return false;
        }
        if (!Objects.equals(this.Country, other.Country)) {
            return false;
        }
        return true;
    }

}
