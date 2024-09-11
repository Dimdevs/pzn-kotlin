fun main() {
    val nilaUjian = 80;
    val Absen = 80;
    val nilaiExtra = 80;

    val apakahLulusUjian = nilaUjian > 75;
    val apakahLulusAbsen = Absen > 75;
    val apakahLulusExtra = nilaiExtra > 75;

    val apakahLulus = apakahLulusUjian && apakahLulusAbsen && apakahLulusExtra;
    //    val apakahLulus = (apakahLulusUjian && apakahLulusAbsen) && apakahLulusExtra;
    //    val apakahLulus = ((apakahLulusUjian && apakahLulusAbsen) && apakahLulusExtra);

    println(apakahLulus);
}