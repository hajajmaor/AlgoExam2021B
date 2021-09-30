enum NecklaceType {
    Uniq, Boring, Regular, Perfect
}

class Necklace {
    int green, yellow, red;

    Necklace(int green, int yellow, int red) {
        this.green = green;
        this.yellow = yellow;
        this.red = red;
    }

    NecklaceType getNecklaceType() {
        if (this.green != 0 && this.yellow == 0 && this.red == 0 || this.green == 0 && this.yellow == 0 && this.red != 0
                || this.green == 0 && this.yellow != 0 && this.red == 0) {
            return NecklaceType.Uniq;
        } else if (this.green == this.yellow && this.yellow == this.red) {
            return NecklaceType.Perfect;
        } else if (this.green != 0 && this.yellow != 0 && this.red == 0
                || this.green == 0 && this.yellow != 0 && this.red != 0
                || this.green != 0 && this.yellow == 0 && this.red != 0) {
            return NecklaceType.Boring;
        } else {
            return NecklaceType.Regular;
        }
    }

    int getLength() {
        return this.green + this.yellow + this.red;
    }
}

public class Ex2 {
    int howManyBoringNecklaces(Necklace[] necklaces, int num) {
        int counter = 0;
        for (Necklace nck : necklaces) {
            if (nck.getLength() > num && nck.getNecklaceType() == NecklaceType.Boring) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {

    }
}
