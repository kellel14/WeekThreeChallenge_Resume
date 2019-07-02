public class ProficiencyRating {
    private String fundamental;
    private String novice;
    private String intermediate;
    private String advanced;
    private String expert;
    //possible to set proficiencyRating as a boolean then use
    //switch statement to allow user to select their levels
    public ProficiencyRating(){
    }

    public ProficiencyRating(String fundamental, String novice, String intermediate,
                             String advanced, String expert) {
        this.fundamental = fundamental;
        this.novice = novice;
        this.intermediate = intermediate;
        this.advanced = advanced;
        this.expert = expert;
    }

    public String getFundamental() {
        return fundamental;
    }

    public void setFundamental(String fundamental) {
        this.fundamental = fundamental;
    }

    public String getNovice() {
        return novice;
    }

    public void setNovice(String novice) {
        this.novice = novice;
    }

    public String getIntermediate() {
        return intermediate;
    }

    public void setIntermediate(String intermediate) {
        this.intermediate = intermediate;
    }

    public String getAdvanced() {
        return advanced;
    }

    public void setAdvanced(String advanced) {
        this.advanced = advanced;
    }

    public String getExpert() {
        return expert;
    }

    public void setExpert(String expert) {
        this.expert = expert;
    }
}
