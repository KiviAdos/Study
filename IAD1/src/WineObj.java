public class WineObj {
    private double Alcohol;
    private double MalicAcid;
    private double Ash;
    private double AlcalinityOfAsh;
    private double Magnesium;
    private double TotalPhenols;
    private double Flavanoids;
    private double NonflavanoidPhenols;
    private double Proanthocyanins;
    private double ColorIntensity;
    private double Hue;
    private double DilutedVines;
    private double Proline;

    public WineObj()
    {
        Alcohol = 0;
        MalicAcid = 0;
        Ash = 0;
        AlcalinityOfAsh = 0;
        Magnesium = 0;
        TotalPhenols = 0;
        Flavanoids = 0;
        NonflavanoidPhenols = 0;
        Proanthocyanins = 0;
        ColorIntensity = 0;
        Hue = 0;
        DilutedVines = 0;
        Proline = 0;
    }

    public WineObj(double alcohol, double malicAcid, double ash, double alcalinityOfAsh, double magnesium, double totalPhenols,
                   double flavanoids, double nonflavanoidPhenols, double proanthocyanins, double colorIntensity, double hue,
                   double dilutedVines, double proline) {
        Alcohol = alcohol;
        MalicAcid = malicAcid;
        Ash = ash;
        AlcalinityOfAsh = alcalinityOfAsh;
        Magnesium = magnesium;
        TotalPhenols = totalPhenols;
        Flavanoids = flavanoids;
        NonflavanoidPhenols = nonflavanoidPhenols;
        Proanthocyanins = proanthocyanins;
        ColorIntensity = colorIntensity;
        Hue = hue;
        DilutedVines = dilutedVines;
        Proline = proline;
    }

    public void setAlcohol(double alcohol) {
        Alcohol = alcohol;
    }

    public void setMalicAcid(double malicAcid) {
        MalicAcid = malicAcid;
    }

    public void setAsh(double ash) {
        Ash = ash;
    }

    public void setAlcalinityOfAsh(double alcalinityOfAsh) {
        AlcalinityOfAsh = alcalinityOfAsh;
    }

    public void setMagnesium(double magnesium) {
        Magnesium = magnesium;
    }

    public void setTotalPhenols(double totalPhenols) {
        TotalPhenols = totalPhenols;
    }

    public void setFlavanoids(double flavanoids) {
        Flavanoids = flavanoids;
    }

    public void setNonflavanoidPhenols(double nonflavanoidPhenols) {
        NonflavanoidPhenols = nonflavanoidPhenols;
    }

    public void setProanthocyanins(double proanthocyanins) {
        Proanthocyanins = proanthocyanins;
    }

    public void setColorIntensity(double colorIntensity) {
        ColorIntensity = colorIntensity;
    }

    public void setHue(double hue) {
        Hue = hue;
    }

    public void setDilutedVines(double dilutedVines) {
        DilutedVines = dilutedVines;
    }

    public void setProline(double proline) {
        Proline = proline;
    }
    public void printWine()
    {
        System.out.println("Alcohol="+Alcohol+" MalicAcid="+MalicAcid+" Ash="+Ash+" Alcalinity of ash="+AlcalinityOfAsh+
                " Magnesium="+Magnesium+" Total phenols="+TotalPhenols+" Flavanoids="+Flavanoids+
                " Nonflavanoid phenols="+NonflavanoidPhenols+" Proanthocyanins="+Proanthocyanins+" Color intencity="+
                ColorIntensity+" Hue="+Hue+" OD380/OD315 of diluted wines="+DilutedVines+" Proline=" + Proline);
    }
}
