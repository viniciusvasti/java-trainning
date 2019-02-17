package vas.book.effectivejava.methodscommonallobjects.equals;

/**
 *
 * @author vinicius
 */
public class PhoneNumber {

    private final short areaCode;
    private final short prefix;
    private final short sufix;

    public PhoneNumber(short areaCode, short prefix, short sufix) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.sufix = sufix;
    }

    public short getAreaCode() {
        return areaCode;
    }

    public short getPrefix() {
        return prefix;
    }

    public short getSufix() {
        return sufix;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.areaCode;
        hash = 97 * hash + this.prefix;
        hash = 97 * hash + this.sufix;
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
        if (!(obj instanceof PhoneNumber)) {
            return false;
        }
        final PhoneNumber other = (PhoneNumber) obj;
        return this.areaCode == other.areaCode
                && this.areaCode == other.areaCode
                && this.sufix == other.sufix;
    }

}
