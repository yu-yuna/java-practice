package pr_4.z1;

public class TestSeasons {

    public static void main(String[] args) {

        Seasons favoriteSeason = Seasons.SUMMER;

        System.out.println("Любимое время года: " + favoriteSeason);
        System.out.println("Средняя температура: "
                + favoriteSeason.getAverageTemperature());
        System.out.println("Описание: "
                + favoriteSeason.getDescription());

                
        System.out.println();
        favoriteSeason.printLove();
        System.out.println();
        for (Seasons season : Seasons.values()) {
            System.out.println(season);
        }
    }
}