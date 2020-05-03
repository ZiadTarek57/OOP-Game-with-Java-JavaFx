package project;

public class Setting {
    private int bgpic;
    private int bgmusic;
    private int minDim, maxDim;
    
    public Setting(int pic, int music,int mind,int maxd )
    {
        this.bgpic= pic;
        this.bgmusic= music;
        this.minDim= mind;
        this.maxDim= maxd;
    }

    /**
     * @return the bgpic
     */
    public int getBgpic() {
        return bgpic;
    }

    /**
     * @param bgpic the bgpic to set
     */
    public void setBgpic(int bgpic) {
        this.bgpic = bgpic;
    }

    /**
     * @return the bgmusic
     */
    public int getBgmusic() {
        return bgmusic;
    }

    /**
     * @param bgmusic the bgmusic to set
     */
    public void setBgmusic(int bgmusic) {
        this.bgmusic = bgmusic;
    }

    /**
     * @return the minDim
     */
    public int getMinDim() {
        return minDim;
    }

    /**
     * @param minDim the minDim to set
     */
    public void setMinDim(int minDim) {
        this.minDim = minDim;
    }

    /**
     * @return the maxDim
     */
    public int getMaxDim() {
        return maxDim;
    }

    /**
     * @param maxDim the maxDim to set
     */
    public void setMaxDim(int maxDim) {
        this.maxDim = maxDim;
    }
    
}


