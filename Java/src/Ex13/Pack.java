package Ex13;

public class Pack {
    Pencil[] allPencils;
    String[] colors;
    int currNum;
    int max, min;

    public Pack(int size, String[] colors, int min, int max) {
        this.allPencils = new Pencil[size];
        this.colors = colors;
        this.currNum = 0;
        this.max = max;
        this.min = min;
    }

    public boolean isFit(Pencil p) {
        if (p.color1.equals(p.color2)) {
            return false;
        }
        if (p.size > max || p.size < min) {
            return false;
        }
        return true;
    }

    public boolean add(Pencil p) {
        if (this.isFit(p)) {
            if (this.currNum < this.allPencils.length) {
                this.allPencils[currNum] = p;
                currNum++;
                return true;
            }
        }
        return false;
    }

    public int countColor(String color) {
        int counter = 0;
        for (int i = 0; i < this.currNum; i++) {
            if (this.allPencils[i].color1.equals(color) || this.allPencils[i].color2.equals(color)) {
                counter++;
            }
        }
        return counter;
    }

    public String[] missingColors() {
        int counter = 0;
        for (String color : this.colors) {
            if (this.countColor(color) > 0) {
                counter++;
            }
        }
        if (counter == 0) {
            return new String[0];
        }
        String[] result = new String[counter];
        int index = 0;
        for (String color : this.colors) {
            if (this.countColor(color) > 0) {
                result[index] = color;
                index++;
            }
        }
        return result;
    }

    public Pencil[] getAllPencils() {
        return allPencils;
    }

    public void setAllPencils(Pencil[] allPencils) {
        this.allPencils = allPencils;
    }

    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    public int getCurrNum() {
        return currNum;
    }

    public void setCurrNum(int currNum) {
        this.currNum = currNum;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }
}